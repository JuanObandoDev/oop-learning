from account import Account

class Driver(Account):
    uberCode = int

    def __init__(self, name, document, email, password, uberCode):
        super().__init__(name, document, email, password)
        self.uberCode = uberCode

    def toString(self):
        return super().toString() + ", Uber Code: " + str(self.uberCode)