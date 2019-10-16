<?php

use Illuminate\Database\Seeder;

class RentTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        factory(App\Rent::class, 8)->create();
    }
}
