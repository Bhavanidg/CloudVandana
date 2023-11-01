const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Enter numbers separated by commas: ", (input) => {
  // Split the input into an array of numbers
  const numbers = input.split(',').map(Number);

  // Using the sort() method with a custom compare function
  numbers.sort(function(a, b) {
    return b - a;
  });

  console.log("Array in descending order:", numbers);

  rl.close();
});
