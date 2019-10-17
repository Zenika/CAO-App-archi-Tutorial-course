<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Sealion;
use Illuminate\Support\Facades\Date;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Validator;

class SealionController extends Controller
{
    public function getSealions()
    {
        $sealLionsOld = Sealion::all();
        $currentDate =  date("Y-m-d H:i:s");
        var_dump($currentDate);
        $rents = DB::table("rents")->select("sealion_id", "end_date")->where("end_date", "<", $currentDate)->get();
        var_dump($rents);
        foreach ($rents as $rent) {
            var_dump($rent);//, $sealLions);
        }
//        $sealLions = DB::table("sealions")
//            ->where([""]);
        die;
        return response()->json($sealLions);
    }

    public function getSealion($id)
    {
        $sealLions = Sealion::findOrFail($id);

        return response()->json($sealLions);
    }

    public function addSealion(Request $request)
    {

        $rules = [
            'caliber'=> 'required',
            'miles'=> 'required',
            'speed'=> 'required',
            'period'=> 'required',
        ];

        $message = [
            'required' => "Tous les champs ne sont pas remplis"
        ];

        $validator = Validator::make($request->all(), $rules, $message);

        if ($validator->fails()) {
            return response()->json(['error' => $validator->errors()->first()]);
        }

        $sealion = new Sealion([
            'caliber' => (int)$request->input('caliber'),
            'miles' => (int)$request->input('miles'),
            'speed' => (int)$request->input('speed'),
            'period' => (int)$request->input('period')
        ]);

        $sealion->save();

        return response()->json($sealion);
    }
}
