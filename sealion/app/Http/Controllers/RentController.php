<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Rent;
use Illuminate\Support\Facades\Validator;


class RentController extends Controller
{

    public function getRents() 
    {
        $rents = Rent::all();
        
        return response()->json($rents);
    }

    public function getRent($id) 
    {
        $rent = Rent::findOrFail($id);

        return response()->json($rent);
    }

    public function addRent(Request $request)
    {

        $rules = [
            'rent'=> 'required',
            'start_date'=> 'required',
            'end_date'=> 'required',
            'sealion_id'=> 'required',
            'option_id'=> 'required',
        ];

        $message = [
            'required' => "Tous les champs ne sont pas remplis"
        ];

        $validator = Validator::make($request->all(), $rules, $message);

        if ($validator->fails()) {
            return response()->json([ 'error' => $validator->errors()->first()]);
        }

        $rent = new Rent([
            'rent' => $request->input('rent'),
            'start_date' => $request->input('start_date'),
            'end_date' => $request->input('end_date'),
            'sealion_id' => $request->input('sealion_id'),
            'option_id' => $request->input('option_id')
        ]);

        $rent->save();

        return response()->json($rent);
    }

}
