class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document, email, password):
        self.name = name
        self.document = document
        self.email = email
        self.password = password

    def toString(self):
        return "Name: " + self.name + ", Document: " + self.document + ", Email: " + self.email + ", Password: " + self.password