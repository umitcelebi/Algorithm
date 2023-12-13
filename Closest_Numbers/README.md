# [Closest Numbers](https://www.hackerrank.com/challenges/closest-numbers/problem)

Sorting is useful as the first step in many different tasks. 
The most common task is to make finding things easier, 
but there are other uses as well. In this case, it will 
make it easier to determine which pair or pairs of
elements have the smallest absolute difference between them.

> **Example**

**arr = [5, 2, 3, 4, 1]**

Sorted, **arr<sup>'</sup> = [1, 2, 3, 4, 5]**. Several pairs have the minimum 
difference of 1: **[(1, 2), (2, 3), (3, 4), (4, 5)]**. 
Return the array **[1,2,2,3,3,4,4,5]**.

>**Function Description**

Complete the closestNumbers function in the editor below.

closestNumbers has the following parameter(s):

- int arr[n]: an array of integers

>**Returns**

- int[]: an array of integers as described

>**Input Format**

The first line contains a single integer **n**, the length of **arr**.
The second line contains **n** space-separated integers, **arr[i]**.

> **Constraints**

- 2 &le; n &le; 200000
- -10<sup>7</sup> &le; arr[i] &le; 10<sup>7</sup>
- all **a[i]** are unique in **arr**

> **Sample Input 0**
```
10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 
```

> **Sample Output 0**
```
-20 30
```

> **Explanation 0**

(30) - (-20) = 50, which is the smallest difference.

> **Sample Input 1**
```
12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470 
```

> **Sample Output 1**
```
-520 -470 -20 30
```

> **Explanation 1**

(-470) - (-520) = 30 - (-20) = 50, which is the smallest difference.
