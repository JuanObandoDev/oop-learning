class route {
  constructor() {
    this.id;
    this.init;
    this.end;
  }

  printDataRoute = () => {
    return `Id: ${this.id}, Init: ${this.init}, End: ${this.end}`;
  };
}

module.exports = route;
