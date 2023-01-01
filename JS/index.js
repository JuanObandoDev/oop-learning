const account = require("./account");
const car = require("./car");
const payment = require("./payment");
const driver = require("./driver");
const UberX = require("./uberX");
const UberPool = require("./uberPool");
const UberVan = require("./uberVan");
const UberBlack = require("./uberBlack");
const User = require("./user");

console.log("Hello World!");

let acc = new account("Juan", "123456789", "example@example.com", "acc123");
let auto = new car("ABC123", acc, 4);
let pay = new payment();

console.log(acc.printDataAccount());
console.log(auto.printDataCar());

let dri = new driver("Angela", "987654321", "example@example.com", "driver123");

console.log(dri.printDataAccount());

let uberX = new UberX("ABC123", dri, 4, "Chevrolet", "Spark");
console.log(uberX.printDataCar());

let user = new User("Juan", "123456789", "example@example.com", "user123");
