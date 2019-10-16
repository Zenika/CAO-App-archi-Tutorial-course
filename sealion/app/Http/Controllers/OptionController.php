<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Option;

class OptionController extends Controller
{
    public function getOptions() 
    {    
        $options = Option::all();

        return response()->json($options);
    }

    public function getOption($id)
    {
        $option = Option::findOrFail($id);

        return response()->json($option);
    }
}