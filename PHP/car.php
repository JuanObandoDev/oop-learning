<?php
require_once('account.php');
class car {
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function __constructor($license, $driver, $passenger) {
        $this->license = $license;
        $this->driver = $driver;
        $this->passenger = $passenger;
    }

    public function printDataCar() {
        return "License: $this->license, Driver: {$this->driver->name}, Passenger: $this->passenger";
    }
}
?>