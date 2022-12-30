<?php
require_once('car.php');
class uberBlack extends car {
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __contructor($license, $driver, $passenger, $typeCarAccepted, $seatsMaterial) {
        parent::__contructor($license, $driver, $passenger);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }

    public function printDataCar() {
        return "License: $this->license, Driver: {$this->driver->name}, Passenger: $this->passenger, Type Car Accepted: $this->typeCarAccepted, Seats Material: $this->seatsMaterial";
    }
}
?>