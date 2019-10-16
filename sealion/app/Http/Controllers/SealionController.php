<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Sealion;

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
}
