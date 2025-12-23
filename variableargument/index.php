<?php
/*
===========================================
PHP INTRODUCTION GUIDE
===========================================

PHP (PHP: Hypertext Preprocessor) is a popular server-side scripting language
designed for web development but also used as a general-purpose programming language.

Key Features:
- Server-side scripting
- Cross-platform (Windows, Linux, macOS)
- Open source and free
- Large community support
- Easy to learn and use
- Supports multiple databases
*/

echo "<h1>Welcome to PHP!</h1>\n";

// ===========================================
// 1. BASIC SYNTAX
// ===========================================
echo "<h2>1. Basic Syntax</h2>\n";

// PHP code is enclosed in <?php ... ?> tags
// Variables start with $ symbol
$message = "Hello, PHP World!";
echo "<p>$message</p>\n";

// PHP is case-sensitive for variables but not for keywords
$name = "Alice";
$Name = "Bob";  // Different variable
echo "<p>name: $name, Name: $Name</p>\n";

// ===========================================
// 2. VARIABLES AND DATA TYPES
// ===========================================
echo "<h2>2. Variables and Data Types</h2>\n";

// String
$greeting = "Hello World";
echo "<p>String: $greeting</p>\n";

// Integer
$age = 25;
echo "<p>Integer: $age</p>\n";

// Float
$price = 19.99;
echo "<p>Float: $price</p>\n";

// Boolean
$isActive = true;
echo "<p>Boolean: " . ($isActive ? 'true' : 'false') . "</p>\n";

// Array
$fruits = array("apple", "banana", "orange");
echo "<p>Array: " . implode(", ", $fruits) . "</p>\n";

// Modern array syntax
$colors = ["red", "green", "blue"];
echo "<p>Modern Array: " . implode(", ", $colors) . "</p>\n";

// ===========================================
// 3. OPERATORS
// ===========================================
echo "<h2>3. Operators</h2>\n";

$a = 10;
$b = 3;

echo "<p>Arithmetic: $a + $b = " . ($a + $b) . "</p>\n";
echo "<p>Comparison: $a > $b = " . ($a > $b ? 'true' : 'false') . "</p>\n";
echo "<p>Logical: true AND false = " . (true && false ? 'true' : 'false') . "</p>\n";

// String concatenation
$firstName = "John";
$lastName = "Doe";
$fullName = $firstName . " " . $lastName;
echo "<p>Concatenation: $fullName</p>\n";

// ===========================================
// 4. CONTROL STRUCTURES
// ===========================================
echo "<h2>4. Control Structures</h2>\n";

// If-else statement
$score = 85;
if ($score >= 90) {
    $grade = "A";
} elseif ($score >= 80) {
    $grade = "B";
} elseif ($score >= 70) {
    $grade = "C";
} else {
    $grade = "F";
}
echo "<p>Score: $score, Grade: $grade</p>\n";

// Switch statement
$day = "Monday";
switch ($day) {
    case "Monday":
        $activity = "Start the week strong";
        break;
    case "Friday":
        $activity = "TGIF!";
        break;
    default:
        $activity = "Regular day";
}
echo "<p>$day: $activity</p>\n";

// ===========================================
// 5. LOOPS
// ===========================================
echo "<h2>5. Loops</h2>\n";

// For loop
echo "<p>For loop: ";
for ($i = 1; $i <= 5; $i++) {
    echo "$i ";
}
echo "</p>\n";

// While loop
echo "<p>While loop: ";
$counter = 1;
while ($counter <= 3) {
    echo "$counter ";
    $counter++;
}
echo "</p>\n";

// Foreach loop
echo "<p>Foreach loop: ";
$numbers = [10, 20, 30];
foreach ($numbers as $number) {
    echo "$number ";
}
echo "</p>\n";

// ===========================================
// 6. FUNCTIONS
// ===========================================
echo "<h2>6. Functions</h2>\n";

// Function definition
function greet($name, $title = "Mr.") {
    return "Hello, $title $name!";
}

// Function call
echo "<p>" . greet("Smith") . "</p>\n";
echo "<p>" . greet("Johnson", "Dr.") . "</p>\n";

// Function with multiple return values
function calculate($x, $y) {
    return [
        'sum' => $x + $y,
        'product' => $x * $y,
        'difference' => $x - $y
    ];
}

$results = calculate(8, 3);
echo "<p>8 + 3 = {$results['sum']}</p>\n";
echo "<p>8 * 3 = {$results['product']}</p>\n";

// ===========================================
// 7. ARRAYS (ADVANCED)
// ===========================================
echo "<h2>7. Arrays</h2>\n";

// Indexed array
$cities = ["New York", "London", "Tokyo"];
echo "<p>First city: {$cities[0]}</p>\n";

// Associative array
$person = [
    "name" => "Alice",
    "age" => 30,
    "city" => "Paris"
];
echo "<p>Person: {$person['name']}, Age: {$person['age']}</p>\n";

// Multidimensional array
$students = [
    ["name" => "John", "grade" => 85],
    ["name" => "Jane", "grade" => 92],
    ["name" => "Bob", "grade" => 78]
];

echo "<p>Students:</p>\n<ul>\n";
foreach ($students as $student) {
    echo "<li>{$student['name']}: {$student['grade']}</li>\n";
}
echo "</ul>\n";

// ===========================================
// 8. SUPERGLOBALS
// ===========================================
echo "<h2>8. Superglobals</h2>\n";

// $_SERVER contains server and environment information
echo "<p>Server Name: " . $_SERVER['SERVER_NAME'] . "</p>\n";
echo "<p>Request Method: " . $_SERVER['REQUEST_METHOD'] . "</p>\n";

// $_GET and $_POST for form data (examples)
echo "<p>GET and POST are used for form data handling</p>\n";

// ===========================================
// 9. ERROR HANDLING
// ===========================================
echo "<h2>9. Error Handling</h2>\n";

// Try-catch block
try {
    $result = 10 / 2;  // This works fine
    echo "<p>Division result: $result</p>\n";
    
    // Simulate an error
    if ($result < 10) {
        throw new Exception("Result is too small!");
    }
} catch (Exception $e) {
    echo "<p>Error caught: " . $e->getMessage() . "</p>\n";
}

// ===========================================
// 10. USEFUL BUILT-IN FUNCTIONS
// ===========================================
echo "<h2>10. Useful Built-in Functions</h2>\n";

$text = "  Hello PHP World  ";
echo "<p>Original: '$text'</p>\n";
echo "<p>Trimmed: '" . trim($text) . "'</p>\n";
echo "<p>Uppercase: " . strtoupper($text) . "</p>\n";
echo "<p>Length: " . strlen(trim($text)) . "</p>\n";

// Date and time
echo "<p>Current date: " . date('Y-m-d H:i:s') . "</p>\n";

// Random number
echo "<p>Random number (1-100): " . rand(1, 100) . "</p>\n";

// ===========================================
// CONCLUSION
// ===========================================
echo "<h2>Next Steps</h2>\n";
echo "<p>This introduction covers PHP basics. To continue learning:</p>\n";
echo "<ul>\n";
echo "<li>Learn about Object-Oriented Programming in PHP</li>\n";
echo "<li>Explore database connectivity (MySQL, PDO)</li>\n";
echo "<li>Study form handling and validation</li>\n";
echo "<li>Learn about sessions and cookies</li>\n";
echo "<li>Explore PHP frameworks like Laravel or Symfony</li>\n";
echo "</ul>\n";

echo "<p><strong>Happy coding with PHP!</strong></p>\n";
?>