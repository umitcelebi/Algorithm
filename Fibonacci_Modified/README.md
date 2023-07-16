# Fibonacci Modified
Implement a modified Fibonacci sequence using the following definition:

Given three integers, **t1**, **t2**, and **n**, compute and print 
the **n<sup>th</sup>** term of a modified Fibonacci sequence.


> **Example**

**t1 = 0**

**t2 = 1**

**n = 6**
- **t3 = 0 + 1<sup>2</sup> = 1**
- **t4 = 1 + 1<sup>2</sup> = 2**
- **t5 = 1 + 2<sup>2</sup> = 5**
- **t6 = 2 + 5<sup>2</sup> = 27**


Return 27.

>**Function Description**

Complete the fibonacciModified function in the editor below. ,
It must return the **n<sup>th</sup>** number in the sequence.

fibonacciModified has the following parameter(s):

- int t1: an integer
- int t2: an integer
- int n: the iteration to report

>**Returns**

- int: the **n<sup>th</sup>** number in the sequence
  
Note: The value of **t[n]** may far exceed the range of a 64-bit 
integer. Many submission languages have libraries that can handle such large results but, for those that don't (e.g., C++), you will need to compensate for the size of the result.

>**Input Format**

A single line of three space-separated integers, the values of 
**t1**, **t2**, and **n**.



> **Constraints**

- **0 &le; t1, t2 &le; 2**
- **3 &le; n &le; 20**

> **Sample Input 0**
```
0 1 5
```

> **Sample Output 0**
```
5
```

> **Explanation 0**

The first two terms of the sequence 
are **t1 = 0** and **t2 = 1**, which gives us a modified 
Fibonacci sequence of **{0, 1, 1, 2, 5, 27,...}**. 
The 5<sup>th</sup> term is **5**.