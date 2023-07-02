# Halloween Sale

You wish to buy video games from the famous online video game store Mist.

Usually, all games are sold at the same price, **p** dollars. However, 
they are planning to have the seasonal Halloween Sale next month 
in which you can buy games at a cheaper price. Specifically, 
the first game will cost **p** dollars, and every subsequent game will 
cost **d** dollars less than the previous one. This continues until the 
cost becomes less than or equal to **m** dollars, after which every game 
will cost **m** dollars. How many games can you buy during the Halloween Sale?

>**Example**

**p = 20**
**d = 3**
**m = 6**
**s = 70**

The following are the costs of the first **1**, in order:
    **20, 17, 14, 11, 8, 6, 6, 6...**

Start at **p = 20** units cost, reduce that by **d = 3** units each iteration 
until reaching a minimum possible price, **m = 6**. Starting with **s = 70** 
units of currency in your Mist wallet, you can buy 5 games: 
**20 + 17 + 14 + 11 + 8 = 70**.

>**Function Description**

Complete the howManyGames function in the editor below.

howManyGames has the following parameters:

- int p: the price of the first game
- int d: the discount from the previous game price
- int m: the minimum cost of a game
- int s: the starting budget


> **Sample Input 0**
```
    20 3 6 80
```

> **Sample Output 0**
```
    6
```

> **Explanation 0**

Assumptions other than starting funds, **s**, match the example in the problem 
statement. With a budget of **80**, you can buy **6** games at a cost 
of **20 + 17 + 14 + 11 + 8 + 6 = 76**. A **7<sup>th</sup>** game for an 
additional **6** units exceeds the budget.