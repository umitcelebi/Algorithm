# [Zig Zag Sequence](https://www.hackerrank.com/challenges/zig-zag-sequence/problem)

Given an array of **n** distinct integers, transform the array into a zig zag sequence 
by permuting the array elements. A sequence will be called a 
zig zag sequence if the first **k** elements in the sequence are in 
increasing order and the last **k** elements are in decreasing order, 
where **k = (n + 1) / 2**. You need to find the lexicographically smallest 
zig zag sequence of the given array.

>**Example**

- **[2, 3, 5, 1, 4]**

Now if we permute the array as **[1, 4, 5, 3, 2]**, the result is a zig zag sequence.

Debug the given function findZigZagSequence to return the appropriate zig zag sequence for the given input array.

**Note:** You can modify at most three lines in the given code. You cannot add or remove lines of code.

To restore the original code, click on the icon to the right of the language selector.


>**Input Format**

The first line contains **t** the number of test cases. 
The first line of each test case contains an integer **n**, 
denoting the number of array elements. The next line of 
the test case contains **n** elements of array **a**.

> **Constraints**

- **1 &le; t &le; 20**
- **1 &le; n &le; 10000(n is allways odd)**
- **1 &le; ai &le;10<sup>9</sup>**

> **Output Format**

For each test cases, print the elements of the transformed 
zig zag sequence in a single line.

> **Sample Input 0**
```
1
7
1 2 3 4 5 6 7
```

> **Sample Output 0**
```
1 2 3 7 6 5 4
```