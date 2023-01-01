<?php
require_once('account.php');
class car {
    private $id;
    private $license;
    private $driver;
    protected $passenger;

    public function __constructor($license, $driver, $passenger) {
        $this->id = 101010;
        $this->license = $license;
        $this->driver = $driver;
        $this->passenger = $passenger;
    }
    
    public function getId() {
        return $this->id;
    }
    
    public function getLicense() {
        return $this->license;
    }
    
    public function setLicense($license) {
        $this->license = $license;
    }

    public function getDriver() {
        return $this->driver;
    }

    public function setDriver($driver) {
        $this->driver = $driver;
    }

    public function getPassenger() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if ($passenger != 4) {
            echo "yu need to assing 4 passengers";
            return;
        } else {
            $this->passenger = $passenger;
        }
    }

    public function printDataCar() {
        return "License: $this->license, Driver: {$this->driver->name}, Passenger: $this->passenger";
    }
}
?>