class car {
  constructor(license, driver, passenger) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  printDataCar = () => {
    return `License: ${this.license}, Driver: ${this.driver.name}, Passenger: ${this.passenger}`;
  };
}

module.exports = car;
