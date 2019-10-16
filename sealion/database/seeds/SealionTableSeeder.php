<?php

use Illuminate\Database\Seeder;

class SealionTableSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        factory(App\Sealion::class, 4)->create();
    }
}
