<?PHP
$student = ["id" => 101, "name" => "Sok","score" => 75.5];
$people = ["name" => "Santi", "age" => 20,"high" => 1.75];

$name = $people["name"];
$age = $people["age"];
$high = $people["high"];

print($name ."\n");
print($age."\n");
print($high."\n");

$id = $student["id"];
$name = $student["name"];
$score = $student["score"];

print($id ."\n");
print($name."\n");
print($score."\n");

print_r($student);

// indexed array

$fruits = ["apple","coconut" , "pear"];
$apple = $fruits[0];
$coconut = $fruits[1];
$pear = $fruits[2];

print_r($fruits);


?>
