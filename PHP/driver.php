<?php
require_once("account.php");
class driver extends account {
    public function __contructor($name, $document, $email, $password) {
        parent::__contructor($name, $document, $email, $password);
    }
}
?>