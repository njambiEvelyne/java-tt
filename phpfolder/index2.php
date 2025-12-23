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


?>