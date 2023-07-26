# KnightL on a Chessboard

**KnightL** is a chess piece that moves in an L shape. We define the possible moves of **KnightL(a,b)** as any movement from some position **(x1, y1)** to some **(x2, y2)** satisfying either of the following:

- **x2 = x1 &plusmn; a** and **y2 = y1 &plusmn; b**, or
- **x2 = x1 &plusmn; b** and **y2 = y1 &plusmn; a**

Note that **(a,b)** and **(b,a)** allow for the same exact set of movements. 
For example, the diagram below depicts the possible locations 
that **KnightL(1,2)** or **KnightL(2,1)** can move to from its current location
at the center of a **5 x 5** chessboard:

<img src="imageOne.png" alt="imageOne" width="200">

Observe that for each possible movement, the Knight moves **2** units in one direction (i.e., horizontal or vertical) and **1** unit in the perpendicular direction.

Given the value of **n** for an **n x n** chessboard, answer the following
question for each **(a,b)** pair where **1 &le; a,b < n**:

- What is the minimum number of moves it takes for **KnightL(a,b)** to get from
position **(0,0)** to position **(n - 1, n - 1)**? If it's not possible for the Knight to reach that destination, the answer is -1 instead.

Then print the answer for each **KnightL(a,b)** according to the Output Format specified below.


>**Input Format**

A single integer denoting **n**.


> **Constraints**

- **5 &le; n &le; 25**

> **Output Format**

Print exactly **n - 1** lines of output in which each line **i** (where i &le; j < n) 
contains **n - 1** space-separated integers describing the minimum number 
of moves **KnightL(i, j)** must make for each respective **j** (where 1 &le; j < n).
If some **KnightL(i,j)** cannot reach position **(n - 1, n - 1)**, print -1 instead.

For example, if **n = 3**, we organize the answers for all the **(i,j)** pairs in our output like this:

```
(1,1) (1,2)
(2,1) (2,2)
```


> **Sample Input 0**
```
5
```

> **Sample Output 0**
```
4 4 2 8
4 2 4 4
2 4 -1 -1
8 4 -1 1
```

> **Explanation 0**

<img src="Explanation0.png" alt="Explanation0" width="600">