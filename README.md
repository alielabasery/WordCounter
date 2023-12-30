# WordCounter
This code determines the maximum number of moves that can be applied to a given string S to form a user-specified target word. In each move, the program efficiently counts occurrences of characters in the original string.

The user is prompted to input both the original string S and the target word, and the program calculates the maximum number of moves based on the occurrences of characters in the target word within the original string.

Note: The comparisions are modified to not be case-sensetive.

Example:
A string S is made of uppercase English letters forming the target word "BANANA" (one 'B', three 'A's and two 'N's) can be deleted from the string.
Given S = "NAABXXAN", the function should return 1.
NAABXXAN ->XX
Given S = "NAANAAXNABABYNNBZ", the function should return 2. NAANAAXNABABYNNBZ -> NAAXNABYNBZ-> XBYNZ
Given S = "QABAAAWOBL", the function should return 0. QABAAAWOBL -> QABAAAWOBL
