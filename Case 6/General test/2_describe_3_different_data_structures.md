#### An associative array is a:
>"collection of key value pairs where the key appears at most once in the collection."[[0](https://en.wikipedia.org/wiki/Associative_array)]

##### Three different data structures:

* Hash Tables/Maps: "A hash table uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found"[[1](https://medium.com/@yanganif/javascript-hash-table-8878afceecbc)].  
  * Advantages[[2](https://www.fromdev.com/2016/03/understanding-java-hashmap-and-hashtable.html)]: 
    * When you add items to a HashMap, you are not guaranteed to retrieve the items in the same order you put them in.
    * The purpose of a map is to store items based on a key that can be used to retrieve the item at a later point. 
    * Collection functionality some great utility functions are available for lists via the Collections class.
    * HashMap is non synchronized.HashMap cannot be shared between multiple threads without proper synchronization.Synchronized means only one thread can modify a hash table at one point of time.
    * HashMap is a fail-fast iterator. 

  * Disadvantages[[2](https://www.fromdev.com/2016/03/understanding-java-hashmap-and-hashtable.html)]:
    * You can't lock the whole map to find the size of the map. Iterators are weakly consistent. 
    * HashMap does not guarantee that the order of the map will remain constant over time. 

* Tree Data Structures[[3](https://en.wikipedia.org/wiki/Associative_array#Tree_implementations)]
  * Advantages:
    * The worst-case performance of self-balancing binary search trees is significantly better than that of a hash table, with a time complexity in big O notation of O(log n). This is in contrast to hash tables, whose worst-case performance involves all elements sharing a single bucket, resulting in O(n) time complexity. 
    * self-balancing binary search trees keep their elements in order. Thus, traversing its elements follows a least-to-greatest pattern, whereas traversing a hash table can result in elements being in seemingly random order. However, hash tables have a much better average-case time complexity than self-balancing binary search trees of O(1), and their worst-case performance is highly unlikely when a good hash function is used.
  * Disadvantages: 
    * A self-balancing binary search tree can be used to implement the buckets for a hash table that uses separate chaining. This allows for average-case constant lookup, but assures a worst-case performance of O(log n). However, this introduces extra complexity into the implementation, and may cause even worse performance for smaller hash tables, where the time spent inserting into and balancing the tree is greater than the time needed to perform a linear search on all of the elements of a linked list or similar data structure.
* Associative array
  * Advantages
    * Indexed by keys, which can be any immutable type
    * A simpler data structure that takes up less space
  * Disadvantages
    * Hard to lookup
    * Works best with sequential data