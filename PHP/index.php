<?php
    echo "Hello World";

    // Include
    include('account.php');
    include('car.php');
    include('payment.php');
    include('route.php');

    // Create new account
    $account = new account("Andres Herrera", "1020304050", "example@example.com", "123456");
    $car = new car("ABC123", $account, 4);
    echo $account->printDataAccount();
    echo $car->printDataCar();
?>