class main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create a new instance of the classes
        // account acc = new account("Juan", "123456789", "example@example.com",
        // "123456");
        // car car = new car("ABC123", acc, 4);
        // payment pay = new payment();

        // Print the information of the classes
        // System.out.println(acc.toString());
        // System.out.println(car.toString());
        // System.out.println(pay.toString());

        // create new driver
        driver driver = new driver("Juan", "123456789", "example@example.com", "driver123");
        System.out.println(driver.toString());

        // create uber cars
        uberPool uberPool = new uberPool("ABC123", driver, 4, "Chevrolet", "Spark");
        System.out.println(uberPool.toString());

        uberX uberX = new uberX("DEF456", driver, 4, "Chevrolet", "Cruze");
        System.out.println(uberX.toString());

        // create new user
        user user = new user("Juan", "123456789", "example@example.com", "user123");
        System.out.println(user.toString());
    }
}