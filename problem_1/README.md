# PROBLEM 1: Longest similar subarray

## Problem Statement:

You are given an array of positive integers of length `N` and another integer `K`. You can perform the following operation on the array K times:
- Select any integer occuring in the array and replace it with any other integer.

Your task is to find out the maximum size of a subarray which contains the same integers after performing the above operation.

## Input Format:
- The first line contains the number of test cases `T`.
- The first line of each test case contains the integer `N` the number of elements in the array
- The second line of each test case contains the array `arr` the given array
- The third line contains the integer `K`.

## Output Format:
- Print a single integer the maximum size of subarray which contains all the same integers.

##  Sample Test Cases:

### Case 1:
__Input:__

        N = 9
        arr = [1,2,1,2,3,2,5,3,1]
        K = 3

__Output:__

        6

__Explanation:__ We can replace the integers at index 0, 2, 4 with 2 to get the subarray from index 0 to index 5 of length 6 as subarray with same integer i.e 2

After replacement our array will look like:

        arr = [2,2,2,2,2,2,5,3,1]


### Case 2:
__Input:__

        N = 5
        arr = [1,2,3,4,5]
        K = 1

__Output:__

        2

__Explanation__: We can replace the integers at index 0 with 2 to get the subarray from index 0 to index 1 of length 2 as subarray with same integer i.e 2

After replacement our array will look like:

        arr = [2,2,3,4,5]