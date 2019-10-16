<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Rent;

class RentController extends Controller
{

    public function getRents() 
    {
        $rent = Rent::all();
        
        return response()->json([$rent]);
    }

}
