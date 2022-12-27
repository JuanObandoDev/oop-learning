const account = require("./account");
const car = require("./car");
const payment = require("./payment");

console.log("Hello World!");

let acc = new account("Juan", "123456789", "example@example.com", "123456789");
let auto = new car("ABC123", acc, 4);
let pay = new payment();

console.log(acc.printDataAccount());
console.log(auto.printDataCar());
