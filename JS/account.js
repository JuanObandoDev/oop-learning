class account {
  constructor(name, document, email, password) {
    this.id;
    this.name = name;
    this.document = document;
    this.email = email;
    this.password = password;
  }

  printDataAccount = () => {
    return `Name: ${this.name}, Document: ${this.document}, Email: ${this.email}, Password: ${this.password}`;
  };
}

module.exports = account;
