# OOPLAB5

## Contact
Luxsan Indran,
221298286,
luxsan@my.yorku.ca

Ayan Hasan,
221477393,
ayanh@my.yorku.ca

Abel Berhanu
221633680
abelb23@my.yorku.ca

Yuzhe Lin,
221331327,
yuzhelin@my.yorku.ca

## Reflection Questions
### 1. Explain design choices and trade-offs



### 2. Discuss complexity analysis results
#### 1. MyDoublyLinkedList
addFirst(T data) 
- Time complexity: O(1)
- Only creates a new node and updates head, tail, and adjacent pointers
- No traversal of the linked list is required, resulting in constant time

addLast(T data)
- Time complexity: O(1)
- Similar to addFirst, but instead if updates the tail reference

insertAt(int index, T data)
- Time complexity: O(n)
- In worst case, the whole list has to traversed to reached the desired index, resulting in O(n), with n being the length of the list
- Also need to update .next and .prev once the correct node is found, O(1) for both operations

getFirst()
- Time complexity: O(1)
- Returns head data directly, no traversal required, resulting in O(1)

getLast()
- Time complexity: O(1)
- Returns tail data directly, no traversal required, resulting in O(1)

getAt(int index)
- Time complexity: O(n)
- In worst case, have to traverse the list from head to the node at that specified index
- Results in O(n), with n being length of the list

  


### 3. Demonstrate working implementations



### 4. Reflect on learning outcomes
