# Non-Divisible Subset

Given a set of distinct integers, print the size of a maximal subset of **S** 
where the sum of any **2** numbers in **S<sup>'</sup>** is not evenly 
divisible by **k**.

> **Example**

**S = [19, 10, 12, 10, 24, 25, 22]  k = 4**

One of the arrays that can be created is **S<sup>'</sup>[0] = [10, 12, 25]**. 
Another is **S<sup>'</sup>[1] = [19, 22, 24]**. After testing all permutations, 
the maximum length solution array has **3** elements.

>**Function Description**

Complete the nonDivisibleSubset function in the editor below.

nonDivisibleSubset has the following parameter(s):

- int S[n]: an array of integers
- int k: the divisor

>**Returns**

int: the length of the longest subset of **S** meeting the criteria

>**Input Format**

The first line contains **2** space-separated integers, **n** and **k**, the number of values in **S** and the non factor.
The second line contains **n** space-separated integers, each an **S[i]**, the unique values of the set.

> **Constraints**

- **1 &le; n &le; 10<sup>5</sup>**
- **1 &le; k &le; 100**
- **1 &le; S[i] &le; 10<sup>9</sup>**
- All of the given numbers are distinct.



> **Sample Input 0**
```
STDIN    Function
-----    --------
4 3      S[] size n = 4, k = 3
1 7 2 4  S = [1, 7, 2, 4]
```

> **Sample Output 0**
```
3
```

> **Explanation 0**

The sums of all permutations of two elements from **S = {1, 7, 2, 4}** are:

```
1 + 7 = 8
1 + 2 = 3
1 + 4 = 5
7 + 2 = 9
7 + 4 = 11
2 + 4 = 6
```

Only **S<sup>'</sup> = {1, 7, 4}** will not ever sum to a multiple of **k = 3**.

