const car = require("./car.js");

class UberBlack extends car {
  constructor(license, driver, passenger, typeCarAccepted, seatsMaterial) {
    super(license, driver, passenger);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }

  printDataCar = () => {
    return `License: ${this.license}, Driver: ${this.driver.name}, Passenger: ${this.passenger}, typeCarAccepted: ${this.typeCarAccepted}, seatsMaterial: ${this.seatsMaterial}`;
  };
}

module.exports = UberBlack;
