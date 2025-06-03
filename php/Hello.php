<?php

class Student{

    

    public $Id;
    public $Name;
    public $Math;
    public $English;
    public $Khmer;
    

    public function __construct($id,$Name, $Math,$English,$Khmer){
        $this ->Id = $id;
        $this ->Name = $Name;
        $this ->Math = $Math;
        $this ->English = $English;
        $this ->Khmer = $Khmer;
        
    }

    public function total(){
        return $this-> Math +$this ->English +$this-> Khmer;
    }
    public function average(){
        return $this-> total()/3;
    }



}

    $s1 = new Student(101,"Santi",60,69,59);
    $s2 = new Student(102,"sdd",90,48,60);

    echo "TOtal is : " .$s1->Total()."\n";
    echo "Average is : ".$s1->average()."\n";
    echo "TOtal is : " .$s2->Total()."\n";
    echo "Average is : ".$s2->average()."\n";


    

    


?>