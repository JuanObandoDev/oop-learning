from account import Account
from car import Car
from payment import Payment
from route import Route

if __name__ == "__main__":
    print("Hello World")

    acc = Account("Juan", "123456789", "example@example.com", "123456")
    car = Car("AMS234", acc, 4)
    pay = Payment()
    route = Route()

    print(acc.toString())
    print(car.toString())