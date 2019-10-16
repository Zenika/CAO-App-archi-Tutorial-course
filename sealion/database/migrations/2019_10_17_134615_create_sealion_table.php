<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateSealionTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('sealion', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->integer('calibre');
            $table->integer('kilometrage');
            $table->integer('confort');
            $table->integer('speed');
            $table->timestamp('period');
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('sealion');
    }
}
