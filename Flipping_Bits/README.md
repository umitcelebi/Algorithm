# [Flipping bits](https://www.hackerrank.com/challenges/flipping-bits/problem)

You will be given a list of 32 bit unsigned integers. 
Flip all the bits (**1&rarr;0** and **0&rarr;1**) and 
return the result as an unsigned integer.

>**Example**

**n = 9<sub>10</sub>**

**9<sub>10</sub> = 1001<sub>2</sub>** . We're working with 32 bits, so:

**00000000000000000000000000001001<sub>2</sub> = 9<sub>10</sub>**

**11111111111111111111111111110110<sub>2</sub> = 4294967286<sub>10</sub>**

Returns **4294967286.**


>**Function Description**

Complete the flippingBits function in the editor below.

flippingBits has the following parameter(s):

- int n: an integer

> **Returns**

- int: the unsigned decimal integer result

> **Input Format**

The first line of the input contains **q**, the number of queries.
Each of the next **q** lines contain an integer, **n**, to process.

> **Sample Input**
```
3
2147483647
1
0
```

> **Sample Output**
```
2147483648
4294967294
4294967295
```
> **Explanation**

**01111111111111111111111111111111<sub>2</sub> = 2147483647<sub>10</sub>**

**10000000000000000000000000000000<sub>2</sub> = 2147483648<sub>10</sub>**

**00000000000000000000000000000001<sub>2</sub> = 1<sub>10</sub>**

**11111111111111111111111111111110<sub>2</sub> = 4294967294<sub>10</sub>**

**00000000000000000000000000000000<sub>2</sub> = 0<sub>10</sub>**

**11111111111111111111111111111111<sub>2</sub> = 4294967295<sub>10</sub>**
