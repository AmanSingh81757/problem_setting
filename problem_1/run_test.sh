#!/bin/bash

# Compile the C++ code
g++ -o solution solution.cpp

# Create an output directory if it doesn't exist
mkdir -p outputs

# Loop through each test file and run the C++ code
for i in {1..9}
do
    # Redirect input from the test file and output to the corresponding output file
    ./solution < inputs/test_cases$i.txt > outputs/output$i.txt
    echo "Test case $i completed."
done

echo "All test cases completed."
