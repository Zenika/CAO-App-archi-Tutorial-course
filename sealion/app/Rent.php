<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Rent extends Model
{
    public $timestamps = false;

    public function sealion()
    {
        return $this->hasOne(Sealion::class);
    }
}
