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
        Schema::create('rent', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->integer('sealion_id')->unsigned();
            $table->integer('option_id')->unsigned();
            $table->text('rent');
            $table->dateTime('start_date');
            $table->dateTime('end_date');
            $table->integer('user_id')->unsigned();

            $table->foreign('sealion_id')->references('id')->on('sealion')
            ->onDelete('cascade');
            $table->foreign('option_id')->references('id')->on('option')
                ->onDelete('cascade');
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
