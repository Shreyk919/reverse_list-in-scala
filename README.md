# reverse_list-in-scala
Reverse List using tail recursion

Scala code to reverse a list using tail recursion.

What is tail recursion? 


tail recursion means that the last recursive call in a method/function is recursive. It can also be more easily than normal recursion and in also more efficient.

What is pattern matching block?


A pattern match includes a sequence of alternatives, each starting with the keyword case. Each alternative includes a pattern and one or more expressions, which will be evaluated if the pattern matches. [According to me it works like select case conditional statements]

method reverseList reverses the input list.
Using tail recursion the head (first) element is moved to the new list and the method/function recursively calls itself until the input list is empty.
