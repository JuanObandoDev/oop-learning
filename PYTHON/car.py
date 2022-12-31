from driver import Driver

class Car:
    id = int
    license = str
    driver = Driver
    passenger = int

    def __init__(self, license, driver, passenger):
        self.license = license
        self.driver = driver
        self.passenger = passenger

    def toString(self):
        return "License: " + self.license + ", Driver: " + self.driver.name + ", Passenger: " + str(self.passenger)