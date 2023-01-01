const account = require("./account");

class driver extends account {
  constructor(name, document, email, password) {
    super(name, document, email, password);
  }
}

module.exports = driver;
