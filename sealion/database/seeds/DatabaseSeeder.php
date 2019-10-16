<?php

use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        $this->call(OptionTableSeeder::class);
        $this->call(SealionTableSeeder::class);
        $this->call(RentTableSeeder::class);
        $this->call(UsersTableSeeder::class);
    }
}
