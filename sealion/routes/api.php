<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('/rents', [
    'uses' => 'RentController@getRents'
]);
Route::get('/rents/{id}', [
    'uses' => 'RentController@getRent'
]);

Route::get('/sealions', [
    'uses' => 'SealionController@getSealions'
]);
Route::get('/sealions/{id}', [
    'uses' => 'SealionController@getSealion'
]);

Route::get('/options', [
    'uses' => 'OptionController@getOptions'
]);
Route::get('/options/{id}', [
    'uses' => 'OptionController@getOption'
]);

Route::post('/songs', [
    'uses' => 'SongController@postSong'
]);
Route::put('/songs/{id}', [
    'uses' => 'SongController@putSong'
]);
Route::delete('/songs/{id}', [
    'uses' => 'SongController@deleteSong'
]);