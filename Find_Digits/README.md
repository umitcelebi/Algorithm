# Find Digits

An integer **d** is a divisor of an integer **n** if the remainder of **n / d = 0**.

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.
>**Example**
![Ekran Resmi 2023-06-28 15.04.45.png](..%2F..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fsk%2Fmpb3w1xn0qsc15wgyz5f8p_c0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_NYYtYM%2FEkran%20Resmi%202023-06-28%2015.04.45.png)

>**Function Description**

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

- int n: the value to analyze

>**Returns**

- int: the number of digits in **n** that are divisors of **n**.

>**Input Format**

The first line is an integer,**t** , the number of test cases.
The **t** subsequent lines each contain an integer, **n**.
> ** Constraints **

- *1 <= t <= 15*
- *0 < n < 10<sup>9</sup>*



> **Sample Input 0**
```
    2
    12
    1012
```

> **Sample Output 0**
```
    2
    3
```

> **Explanation 0**

The number **12** is broken into two digits, **1** and **2**. 
When **12** is divided by either of those two digits, the remainder is **0** so they are both divisors.

The number **1012** is broken into four digits, **1**, **0**, **1**, and **2**.
**1012** is evenly divisible by its digits **1**, **1**, and **2**, but it is not divisible by **0** as division by zero is undefined.