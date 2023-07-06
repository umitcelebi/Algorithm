# Encryption

An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let ***L*** be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:

[<img src="imageTwo.png" width="500px"/>](imageTwo.png)

>**Example**

[<img src="imageThree.png" width="500px"/>](imageThree.png)

After removing spaces, the string is **54** characters long. 
&radic;54 is between **7** and **8**, 
so it is written in the form of a grid with 7 rows and 8 columns.
```
ifmanwas  
meanttos          
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots
```

- Ensure that ***rows x columns &ge; L***
- If multiple grids satisfy the above conditions, choose the one with 
- the minimum area, i.e. ***rows x columns***.
The encoded message is obtained by displaying the characters of each column, with a space between column texts. The encoded message for the grid above is:

*imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau*

Create a function to encode a message.

>**Function Description**

Complete the encryption function in the editor below.

encryption has the following parameter(s):

- string s: a string to encrypt

> **Returns**

string: the encrypted string



> **Sample Input 0**
```
    haveaniceday
```

> **Sample Output 0**
```
    hae and via ecy
```

> **Explanation 0**

***L = 12***, &radic;12 is between **3** and **4**.
Rewritten with **3** rows and **4** columns:
```
have
anic
eday
```
