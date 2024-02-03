1. **Array:**
   - Access: O(1)
   - Search: O(n)
   - Insertion: O(n) [O(1) for appending at the end if the array has space]
   - Deletion: O(n)
   - Space Complexity: O(n)

2. **String:**
   - Access: O(1)
   - Search: O(n)
   - Concatenation: O(n)
   - Substring: O(n)
   - Space Complexity: O(n)

3. **Stack:**
   - Push: O(1)
   - Pop: O(1)
   - Peek: O(1)
   - Space Complexity: O(n)

4. **Queue:**
   - Enqueue: O(1)
   - Dequeue: O(1)
   - Peek: O(1)
   - Space Complexity: O(n)

5. **LinkedList:**
   - Access: O(n)
   - Search: O(n)
   - Insertion: O(1) [at the beginning], O(n) [in the middle], O(1) [at the end if tail is kept]
   - Deletion: O(1) [at the beginning], O(n) [in the middle], O(1) [at the end if tail is kept]
   - Space Complexity: O(n)

6. **Graph:**
   - Access: O(1) [for adjacency matrix], O(deg(v)) [for adjacency list]
   - Search: O(V + E) [for DFS or BFS]
   - Insertion: Depends on the specific graph representation
   - Deletion: Depends on the specific graph representation
   - Space Complexity: O(V + E)

7. **Tree:**
   - Search: O(log n) [for balanced binary search tree], O(n) [for unbalanced binary tree]
   - Insertion: O(log n) [for balanced binary search tree], O(n) [for unbalanced binary tree]
   - Deletion: O(log n) [for balanced binary search tree], O(n) [for unbalanced binary tree]
   - Space Complexity: O(n)

8. **Hashmap:**
   - Insertion: O(1) [average case], O(n) [worst case]
   - Deletion: O(1) [average case], O(n) [worst case]
   - Search: O(1) [average case], O(n) [worst case]
   - Space Complexity: O(n)

9. **Hashset:**
   - Insertion: O(1) [average case], O(n) [worst case]
   - Deletion: O(1) [average case], O(n) [worst case]
   - Search: O(1) [average case], O(n) [worst case]
   - Space Complexity: O(n)

10. **VectorList (ArrayList in Java):**
   - Access: O(1)
   - Search: O(n)
   - Insertion: O(n) [when array needs to be resized], O(1) [otherwise]
   - Deletion: O(n) [when array needs to be resized], O(1) [otherwise]
   - Space Complexity: O(n)

11. **Trie:**
   - Insertion: O(n)
   - Search: O(n)
   - Deletion: O(n)
   - Space Complexity: O(n)
