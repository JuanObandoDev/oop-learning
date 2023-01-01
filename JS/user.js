const account = require("./account.js");

class user extends account {
  constructor(name, document, email, password) {
    super(name, document, email, password);
  }
}

module.exports = user;
