<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Sealion extends Model
{
    public $timestamps = false;

    public function option()
    {
        return $this->hasOne(Option::class);
    }
}
