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
        return parent::printDataCar() + ", Type Car Accepted: $this->typeCarAccepted, Seats Material: $this->seatsMaterial";
    }
}
?>