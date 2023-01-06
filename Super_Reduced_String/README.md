Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

>**Example**

s = 'aab'

**aab** shortens to **b** in one operation: remove the adjacent **a** characters.

s = 'abba'

Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

>**Function Description**

Complete the superReducedString function in the editor below.

superReducedString has the following parameter(s):

- string s: a string to reduce

>**Returns**

- string: the reduced string or Empty String


>**Input Format**
- A single string, **s**.

> **Sample Input 0**
>
>aaabccddd


> **Sample Output 0**
>
> abd

> **Sample Input 1**
>
>baab


> **Sample Output 1**
>
> Empty String

> **Explanation 1**
> 
> baab → bb → Empty String




