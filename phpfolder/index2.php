<?php
  $name = "Evelyne";
  echo "My name is " . $name . ". I am 20 years old\n";

  $action = "Show_version";
  $show_seperators = true;

  if($action == "Show_version"){
    echo "The version is 1.23\n";
  }

  if($show_seperators == TRUE){
    echo "\n";
  }

  if($show_seperators){
    echo "<hr>\n";
  }

$num1 = 20;
$num2 = 30;
$sum = $num1 + $num2;
echo $num1 . " + " . $num2 . " = " . $sum . "\n";

$div = $num1 / $num2;
echo $num1 . "/" . $num2 . " = " . $div . "\n";

echo "Array 1 (print_r)\n";
echo "<pre>";
$array1 = array(
  "name" => "Evelyne",
  "age" => 22,
  "address" => "evelyne nganga76@gmail.com"
);
print_r($array1);
echo "</pre>";

echo "Name: " .$array1["name"]. " | Age: ". $array1["age"]. " | Address: ".$array1["address"] . "\n";

echo "<h3>Array 2 (var_dump):</h3>\n";
echo "<pre>";
$array2 = array(
    1    => "a",
    "1"  => "b",
    1.5  => "c",
    true => "d",
);
var_dump($array2);
echo "\n";

$array3 = array(
    "foo" => "bar",
    "bar" => "foo",
    100   => -100,
    -100  => 100,
);
var_dump($array3);

$foods = array("orange", "banana", "coconut", "pineapple");

foreach($foods as $food){
  echo $food. "<br>\n";
}


?>