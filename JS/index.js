const account = require("./account");
const car = require("./car");
const payment = require("./payment");
const driver = require("./driver");
const UberX = require("./uberX");
const UberPool = require("./uberPool");
const UberVan = require("./uberVan");
const UberBlack = require("./uberBlack");

console.log("Hello World!");

let acc = new account("Juan", "123456789", "example@example.com", "123456789");
let auto = new car("ABC123", acc, 4);
let pay = new payment();

console.log(acc.printDataAccount());
console.log(auto.printDataCar());

let dri = new driver(
  "Angela",
  "987654321",
  "example@example.com",
  "123456789",
  "#ABC123"
);

console.log(dri.printDataDriver());

let uberX = new UberX("ABC123", dri, 4, "Chevrolet", "Spark");
console.log(uberX.printDataCar());
