<?php

//While loop
$i = 2;
while($i <6){
  echo $i;
  $i++;
  echo "\n";
}

//do...while
echo "Do while loops \n";
do{
  echo $i;
  $i++;
}while($i<6);

//For loop
for($x = 0; $x <=10; $x++){
  echo "The number is: $x <br>";
}

$members = array("Peter => 35", 
"Joe => 37", "Eileen =>56");
foreach($members as $key => $value){
  echo "$key: $value\n";
}
?>
