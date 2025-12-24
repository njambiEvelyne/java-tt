<?php
  $name = "Evelyne";
  echo "My name is " . $name . ". I am 20 years old";

  $action = "Show_version";
  $show_seperators = true;

  if($action == "Show_version"){
    echo "The version is 1.23";
  }

  if($show_seperators == TRUE){
    echo "<hr>\n";
  }

  if($show_seperators){
    echo "<hr>\n";
  }
$num1 = 20;
$num2 = 30;
$sum = $num1 + $num2;
echo $num1 . " + " . $num2 . " = " . $sum;
echo " ";

$div = $num1 / $num2;
echo ($num1 . "/" . $num2 . " = " . $div);

$array1 = array(
  "name" => "Evelyne",
  "age" => 22,
  "address" => "evelyne nganga76@gmail.com"
);
print_r($array1);




?>