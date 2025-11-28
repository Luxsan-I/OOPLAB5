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
For the Doubly Linked List, a major design choice was maintaining references to both the head and tail, as well as the size variable. This allows operations like adding at the head or tail to be constant time, which significantly improves efficiency instead of traversing the list every time. For the insertAt method, a traversal-based approach was used to reach the target index, ensuring flexibility and it has a linear time cost in the worst case.

The main trade off in the design revolves around effiency versus simplcity. Keeping the head and tail references and a size variable adds extra memory, but it significantly improves performance for operations, especially at the ends of the list — which is a worthy trade off. Traversal based operations like insertAt or getAt, are simple to implement and maintain but can be slower for large lists.

This design shows the benefits and also the limitations of a doubly linked list — it has fast insertions and deletions at both ends, flexible access to elements, but a linear time traversal is required to access indexes, in the worst case, those indexes can be at the end or middle of the list.


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

contains(T data)
- Time complexity: O(n)
- Loops through nodes one by one until it finds the data
- Worst case is if the data is not in the list, requiring a full traversal of the list, resulting in O(n), with n being length of the list

indexOf(T data)
- Time complexity: O(n)
- Similar to contains() method
- Traverses the list and keeps an index counter, worst case traversal is O(n)

  


### 3. Demonstrate working implementations
We showed how doubly linked list do insertions and deletions by adding and removing values at different indices. Then we removed nodes and confirmed that the link worked properly. We also verified that search methods such as contains and indexOf returned accurate results as the structure changed. For the binary search tree we inserted values and oberved how each one what placed in the correct subtree. We also made sure it handles deletion properly. Finally we ran the traversal method to make sure everything worked out well.


### 4. Reflect on learning outcomes
