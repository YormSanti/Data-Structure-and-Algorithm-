<?PHP
$num = [3, 1, 2, 4];
print_r($num);

// add 5

array_push($num,5);
print_r($num);

unset($num[0]);; // remove item at 0
print_r($num);

sort($num); // sort
print_r($num);

rsort($num);// reverse
print_r($num);
