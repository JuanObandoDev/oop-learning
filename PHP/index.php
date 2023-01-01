<?php
    echo "Hello World";

    // Include
    require_once('account.php');
    require_once('car.php');
    require_once('payment.php');
    require_once('route.php');
    require_once('uberX.php');
    require_once('uberPool.php');
    require_once('uberVan.php');
    require_once('uberBlack.php');
    require_once('driver.php');
    require_once('user.php');

    // Create new account
    $account = new account("Andres Herrera", "1020304050", "example@example.com", "acc123");
    $car = new car("ABC123", $account, 4);
    echo $account->printDataAccount();
    echo $car->printDataCar();

    // create uber cars
    $uberX = new uberX("QWE123", $account, 4, "Chevrolet", "Spark");
    echo($uberX->printDataCar());

    $uberPool = new uberPool("ASD123", $account, 4, "Dodge", "Attitude");
    echo($uberPool->printDataCar());

    // create a new driver
    $driver = new driver("Andres Herrera", "1020304050", "example@example.com", "driver123", "#A1B2C3");
    echo($driver->printDataAccount());

    $uberX2 = new uberX("ASD123", $driver, 4, "Dodge", "Attitude");
    echo($uberX2->printDataCar());

    // create a new user
    $user = new user("Juan", "123456789", "example@example.com", "user123");
    echo($user->printDataAccount());
?>