<?php

/** @var \Illuminate\Database\Eloquent\Factory $factory */

use App\Sealion;
use Faker\Generator as Faker;

$factory->define(Sealion::class, function (Faker $faker) {
    return [
        'caliber' => rand(1, 100),
        'miles' => rand(10000, 200000),
        'speed' => rand(1, 5),
        'period' => $faker->dateTime
    ];
});
