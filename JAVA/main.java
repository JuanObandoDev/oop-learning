class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create a new instance of the classes
        account acc = new account("Juan", "123456789", "example@example.com", "123456");
        car car = new car("ABC123", acc.name, 4);
        payment pay = new payment();

        // Print the information of the classes
        System.out.println(acc.toString());
        System.out.println(car.toString());
        System.out.println(pay.toString());
    }
}