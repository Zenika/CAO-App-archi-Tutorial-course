<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Rent;

class RentController extends Controller
{

    public function getRents() 
    {
        $rents = Rent::all();
        
        return response()->json([$rents]);
    }

    public function getRent($id) 
    {
        $rent = Rent::findOrFail($id);

        return response()->json([$rent]);
    }

}
