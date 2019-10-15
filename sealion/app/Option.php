<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Option extends Model
{
    public $timestamps = false;

    public function sealion()
    {
        return $this->belongsTo(Sealion::class);
    }
}
