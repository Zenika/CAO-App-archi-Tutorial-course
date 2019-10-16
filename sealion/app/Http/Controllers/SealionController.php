<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Sealion;
use Illuminate\Support\Facades\Validator;

class SealionController extends Controller
{
    public function getSealions() 
    {
        $sealLions = Sealion::all();

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
