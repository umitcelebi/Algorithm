# [Jim And The Orders](https://www.hackerrank.com/challenges/jim-and-the-orders/problem)

im's Burgers has a line of hungry customers. 
Orders vary in the time it takes to prepare them. 
Determine the order the customers receive their orders. 
Start by numbering each of the customers 
from **1** to **n**, front of the line to the back. 
You will then be given an order number and a preparation 
time for each customer.

The time of delivery is calculated as the sum of the order number 
and the preparation time. If two orders are delivered at 
the same time, assume they are delivered in ascending customer 
number order.

For example, there are **n = 5** customers in line. 
They each receive an order number **order[i]** and a preparation time **prep[i]**.:

```
Customer	1	2	3	4	5
Order #		8	5	6	2	4
Prep time	3	6	2	3	3
Calculate:
Serve time	11	11	8	5	7
```
We see that the orders are delivered to customers in the following order:


```
Order by:
Serve time	5	7	8	11	11
Customer	4	5	3	1	2
```

>**Function Description**

Complete the jimOrders function in the editor below. It should return an array of integers that represent the order that customers' orders are delivered.

jimOrders has the following parameter(s):

- orders: a 2D integer array where each **orders[i]** is in the form 
**[order[i], prep[i]]**.


>**Input Format**

The first line contains an integer **n**, the number of customers.
Each of the next **n** lines contains two space-separated 
integers, an order number and prep time for **customer[i]**.

> **Constraints**

- **1 &le; n &le; 10<sup>3</sup>**
- **1 &le; i &le; n**
- **1 &le; order[i], prep[i] &le;10<sup>6</sup>**

> **Output Format**

Print a single line of **n** 
space-separated customer numbers 
(recall that customers are numbered from **1** to **n**) 
that describes the sequence in which the customers 
receive their burgers. If two or more customers 
receive their burgers at the same time, print their 
numbers in ascending order.

> **Sample Input 0**
```
3
1 3
2 3
3 3
```

> **Sample Output 0**
```
1 2 3
```

>**Explanation 0**

Jim has the following orders:

**order[1] = 1, prep[1] = 3**. This order is delivered at time **t = 1 + 3 = 4**.
**order[2] = 2, prep[2] = 3**. This order is delivered at time **t = 2 + 3 = 5**.
**order[3] = 3, prep[3] = 3**. This order is delivered at time **t = 3 + 3 = 6**.
The orders were delivered in the same 
order as the customers stood in line. 
The index in **order[i]** is the customer number and is what 
is printed. In this case, the customer numbers match the order numbers.