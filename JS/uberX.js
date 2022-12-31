const car = require("./car.js");

class UberX extends car {
  constructor(license, driver, passenger, brand, model) {
    super(license, driver, passenger);
    this.brand = brand;
    this.model = model;
  }

  printDataCar = () => {
    return `License: ${this.license}, Driver: ${this.driver.name}, Passenger: ${this.passenger}, Brand: ${this.brand}, Model: ${this.model}`;
  };
}

module.exports = UberX;
