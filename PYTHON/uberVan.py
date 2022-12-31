from car import Car

class UberVan(Car):
    typeCarAccepted = []
    seatsMaterial = []
    
    def __init__(self, license, driver, passenger, typeCarAccepted, seatsMaterial):
        super().__init__(license, driver, passenger)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial

    def toString(self):
        return super().toString() + ", TypeCarAccepted: " + self.typeCarAccepted + ", SeatsMaterial: " + self.seatsMaterial