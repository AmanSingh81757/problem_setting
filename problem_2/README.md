# PROBLEM 2: Repelling Pairs

## Problem Statement:

You are given an array A of positive integers of length N. For any 2 indices in the array `(i, j)` where `0 <= i < j <= N-1` they are said to be repelling pairs if `A[i] - A[j] =  i + j`.

Your task is to find out the number of repelling pairs in the given array.

## Input Format:
- The first line contains the number of test cases T.
- The first line of each test case contains the integer `N` the number of elements in the array
- The second line of each test case contains the array `A` the given array

## Output Format:
- Print a single integer the number of repelling pairs.

##  Sample Test Cases:

### Case 1:
__Input:__

        N = 9
        A = [6, 4, 7, 3, 9, 1, 8, 2]

__Output:__

        2

__Explanation:__ We have the following repelling pairs:
- (0,3)
- (0,5)


### Case 2:
__Input:__

        N = 5
        A = [1,2,3,4,5]

__Output:__

        0

__Explanation:__ We do not have any repelling pairs in this array.