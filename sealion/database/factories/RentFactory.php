<?php

/** @var \Illuminate\Database\Eloquent\Factory $factory */
use App\Rent;
use Faker\Generator as Faker;

/*
|--------------------------------------------------------------------------
| Model Factories
|--------------------------------------------------------------------------
|
| This directory should contain each of the model factory definitions for
| your application. Factories provide a convenient way to generate new
| model instances for testing / seeding your application's database.
|
*/

$factory->define(Rent::class, function (Faker $faker) {
    return [
        'rent' => $faker->unique()->uuid,
        'start_date' => $faker->dateTime,
        'end_date' => $faker->dateTimeBetween('now', '1 week'),
        'sealion_id' => $faker->numberBetween(1, 4),
        'option_id' => $faker->numberBetween(1, 3),
    ];
});
