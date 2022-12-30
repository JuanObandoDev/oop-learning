<?php
require_once("account.php");
class driver extends account {
    public $uberCode;

    public function __contructor($name, $document, $email, $password, $uberCode) {
        parent::__contructor($name, $document, $email, $password);
        $this->uberCode = $uberCode;
    }

    public function printDataDriver() {
        return "Name: $this->name, Document: $this->document, Email: $this->email, Password: $this->password, Uber Code: $this->uberCode";
    }
}
?>