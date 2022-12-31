const account = require("./account");

class driver extends account {
  constructor(name, document, email, password, uberCode) {
    super(name, document, email, password);
    this.uberCode = uberCode;
  }

  printDataDriver = () => {
    return `Name: ${this.name}, Document: ${this.document}, Email: ${this.email}, Password: ${this.password}, Uber Code: ${this.uberCode}`;
  };
}

module.exports = driver;
