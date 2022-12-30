<?php 
require_once('car.php');
class uberX extends car {
    public $brand;
    public $model;

    public function __contructor($license, $driver, $passenger, $brand, $model) {
        parent::__contructor($license, $driver, $passenger);
        $this->brand = $brand;
        $this->model = $model;
    }

    public function printDataCar() {
        return "License: $this->license, Driver: {$this->driver->name}, Passenger: $this->passenger, Brand: $this->brand, Model: $this->model";
    }
}
?>