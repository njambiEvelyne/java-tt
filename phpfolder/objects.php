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
?>