# Equalize the Array

Given an array of integers, determine the minimum number of elements to 
delete to leave only elements of equal value.

>**Example**

**arr = [1, 2, 2, 3]**

Delete the **2** elements **1** and **3** leaving **arr = [2, 2]**. If both twos plus either the **1** 
or the **3** are deleted, it takes **3** deletions to leave either **[3]** or **[1]**. 
The minimum number of deletions is **2**.

>**Function Description**

Complete the equalizeArray function in the editor below.

equalizeArray has the following parameter(s):

- int arr[n]: an array of integers

>**Returns**

- int: the minimum number of deletions required

>**Input Format**

The first line contains an integer **n**, the number of elements in **arr**.

The next line contains **n** space-separated integers **arr[i]**.

> **Constraints**

- *1 &le; n &le; 100*
- *1 &le; arr[i] &le; 100*


> **Sample Input 0**
```
    STDIN       Function
    -----       --------
    5           arr[] size n = 5
    3 3 2 1 3   arr = [3, 3, 2, 1, 3]
```

> **Sample Output 0**
```
    2
```

> **Explanation 0**

Delete **arr = [2] = 2** and **arr = [3] = 1** to leave 
**arr<sup>'</sup> = [3, 3, 3]**. This is minimal. The only other options are 
to delete **4** elements to get an array of either **[1]** or **[2]**.
