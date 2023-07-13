## Sherlock and The Beast

Sherlock Holmes suspects his archenemy Professor Moriarty is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus. He also gives him a clue: an integer. Sherlock determines the key to removing the virus is to find the largest Decent Number having that number of digits.

A Decent Number has the following properties:

- Its digits can only be 3's and/or 5's.
- The number of 3's it contains is divisible by 5.
- The number of 5's it contains is divisible by 3.
- It is the largest such number for its length.

Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

For example, the numbers **55533333** and **55555** are both decent 
numbers because there are **3 5** 's and **5 3** 's in the first, 
and **6 5** 's in the second. They are the largest values for those length numbers that have proper divisibility of digit occurrences.

>**Function Description**

Complete the decentNumber function in the editor below.

decentNumber has the following parameter(s):

- int n: the length of the decent number to create

>**Prints**

Print the decent number for the given length, or -1 if a decent number of that length cannot be formed. No return value is expected.

>**Input Format**

The first line is an integer, **t**, the number of test cases.

The next **t** lines each contain an integer **n**, the number of digits
in the number to create.

>**Constraints**

- **1 &le; t &le; 20**
- **1 &le; n &le; 100000**

>**Sample Input**
```
STDIN   Function
-----   --------
4       t = 4
1       n = 1 (first test case)
3       n = 3 (second test case)
5
11
```

>**Sample Output**

```
-1
555
33333
55555533333
```