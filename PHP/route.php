<?php
class route {
    public $id;
    public $start;
    public $end;

    public function __constructor($start, $end) {
        $this->start = $start;
        $this->end = $end;
    }

    public function printDataRoute() {
        return "Start: $this->start, End: $this->end";
    }
}
?>