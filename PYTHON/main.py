from account import Account
from car import Car
from payment import Payment
from route import Route
from uberX import UberX
from uberPool import UberPool
from uberBlack import UberBlack
from uberVan import UberVan
from driver import Driver
from user import User

if __name__ == "__main__":
    print("Hello World")

    acc = Account("Juan", "123456789", "example@example.com", "acc123")
    car = Car("AMS234", acc, 4)
    pay = Payment()
    route = Route()

    print(acc.toString())
    print(car.toString())

    driver = Driver("Angela", "123456789", "example@example.com", "driver123")
    print(driver.toString())

    uberX = UberX("AMS234", driver, 4, "Chevrolet", "Spark")
    print(uberX.toString())

    user = User("Juan", "123456789", "example@example.com", "user123")
    print(user.toString())