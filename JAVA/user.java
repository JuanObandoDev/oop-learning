public class user extends account {
    public user(String name, String document, String email, String password) {
        super(name, document, email, password);
    }

    @Override
    public String toString() {
        return ("Name: " + name + ", Document: " + document + ", Email: " + email + ", Password: " + password);
    }
}
