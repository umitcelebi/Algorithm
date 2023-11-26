# [AND Product](https://www.hackerrank.com/challenges/and-product/problem)

Consider two non-negative long integers, **a** and **b**, where **a &le; b**. 
The bitwise AND of all long integers in the inclusive range 
between **a** and **b** can be expressed as **a & (a + 1) & .... & (b - 1) & b**, 
where **&** is the bitwise 
AND operator.

Given **n** pairs of long integers, **a[i]** and **b[i]**, 
compute and print the bitwise AND of all natural numbers in the 
inclusive range between  **a[i]** and **b[i]**.

For example, if **a = 10** and **b = 14**, the calculation is 
**10 & 11 & 12 & 13 & 14 = 8**.

>**Function Description**

Complete the andProduct in the editor below. It should return the computed value as an integer.

andProduct has the following parameter(s):

- a: an integer
- b: an integer

>**Input Format**

The first line contains a single integer , the number of intervals to test.
Each of the next  lines contains two space-separated integers **a[i]** and **b[i]**.

> **Constraints**

- **1 &le; n &le; 200**
- **0 &le; a[i] &le; b[i] &le; 2<sup>32</sup>**

> **Output Format**

For each pair of long integers, print the bitwise AND of all 
numbers in the inclusive range between **a[i]** and **b[i]** on a new line.

> **Sample Input 0**
```
3
12 15
2 3
8 13
```

> **Sample Output 0**
```
12
2
8
```