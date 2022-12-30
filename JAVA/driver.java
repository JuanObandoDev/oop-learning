public class driver extends account {
    public String uberCode;

    public driver(String name, String document, String email, String password, String uberCode) {
        super(name, document, email, password);
        this.uberCode = uberCode;
    }

    @Override
    public String toString() {
        return ("Name: " + name + ", Document: " + document + ", Email: " + email + ", Password: " + password
                + ", Uber Code: " + uberCode);
    }
}
