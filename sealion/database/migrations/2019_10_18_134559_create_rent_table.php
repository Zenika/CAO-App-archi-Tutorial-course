<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateRentTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('rents', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->text('rent');
            $table->dateTime('start_date');
            $table->dateTime('end_date');

        });

        Schema::table('rents', function (Blueprint $table) {
            $table->unsignedBigInteger('sealion_id');
            $table->unsignedBigInteger('option_id');
            
            $table->foreign('sealion_id')->references('id')->on('sealions')->onDelete('cascade');
            $table->foreign('option_id')->references('id')->on('options')->onDelete('cascade');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('rent');
    }
}
