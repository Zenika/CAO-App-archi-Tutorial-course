<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\User;

class UserController extends Controller
{
    
    public function getUsers() 
    {
        $users = User::all();

        return response()->json($users);
    }

    public function getUser($id)
    {
        $user = User::findOrFail($id);
        
        return response()->json($user);
    }
}
