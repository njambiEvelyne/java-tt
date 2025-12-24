<?php
//Objects in php

class Game{
  var $name;
  var $price;
  var $photo;

  public function print_Details() {
    echo "Game: " . $this->name . "<br>\n";
    echo "Price: $" . $this->price . "<br>\n";
    echo "Photo: " . $this->photo . "<br>\n";
  }

}
$game = new Game;
$game->name = "Bioshock Infinite";
$game -> price = 14.99;
$game -> photo = "bioshock-infinite.jpg";

$game ->print_Details();

class foo{
  function do_foo(){
    echo "Doing foo";
  }
}

$bar = new foo;
$bar->do_foo();
echo "<br>\n";

class Student{
  var $name;
  var $age;
  var $regno;
  var $course;

  function details(){
    echo "My name is " . $this->name . ". I am " . $this->age . " years old. I am pursuing " . $this->course . ".<br>\n";
    echo "Registration Number: " . $this->regno . "<br>\n";
  }
}

$student1 = new Student;
$student1->name = "Alice";
$student1->age = 20;
$student1->regno = "ST001";
$student1->course = "Computer Science";

$student1->details();

echo "<hr><h3>Mathematical Functions:</h3>\n";
echo "Pi value: " . pi() . "<br>\n";
echo "Random number (10-100): " . rand(10, 100) . "<br>\n";
echo "Maximum value (1,3,4,6,90): " . max(1,3,4,6,90) . "<br>\n";
echo "Minimum value (2,4,8,889): " . min(2,4,8,889) . "<br>\n";
?>