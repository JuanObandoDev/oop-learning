public class account {
    public int id;
    public String name;
    public String document;
    public String email;
    public String password;

    public account(String name, String document, String email, String password) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return ("Name: " + name + ", Document: " + document + ", Email: " + email + ", Password: " + password);
    }
}
