/*
 DEMO: HashMap<String, Integer> myMap = new HashMap<>();

Step-by-step breakdown of how keys are added, retrieved, updated, removed, and resized:

------------------------------------------------------
 1. Adding Key-Value Pairs
------------------------------------------------------

myMap.add("apple", 10);

- Hash: "apple".hashCode() % 32 → index 5 (assume 5 for explanation)
- values[5] is null → create new List<Pair<String, Integer>>
- Add ("apple", 10) to values[5]
- Increment firstFreeIndex

myMap.add("banana", 20);

- Hash: "banana".hashCode() % 32 → index 13
- values[13] is null → create new list
- Add ("banana", 20) to values[13]

myMap.add("grape", 30);

- Hash: "grape".hashCode() % 32 → index 5 (same as apple → collision)
- values[5] already exists → append ("grape", 30) to same list

 Now:
values[5]   = [("apple", 10), ("grape", 30)]
values[13]  = [("banana", 20)]

------------------------------------------------------
 2. Retrieve Values Using get()
------------------------------------------------------

myMap.get("apple");
- Hash: index 5 → list exists
- Iterate through list:
  → Found "apple" → returns 10

myMap.get("banana");
- Hash: index 13 → found → returns 20

myMap.get("orange");
- Hash points to empty/null bucket → returns null

------------------------------------------------------
 3. Update an Existing Key
------------------------------------------------------

myMap.add("apple", 100);
- Hash: index 5 again
- Find existing "apple" → update value: 10 → 100

 Updated values:
values[5]   = [("apple", 100), ("grape", 30)]

------------------------------------------------------
 4. Remove a Key
------------------------------------------------------

myMap.remove("grape");
- Hash: index 5
- Find and remove "grape" from list

 Updated values:
values[5]   = [("apple", 100)]

------------------------------------------------------
 5. Resize (grow() Method)
------------------------------------------------------

When:
if (1.0 * firstFreeIndex / values.length > 0.75)
→ Resize triggered

How it works:
- Creates a new array with double the capacity
- Rehashes and redistributes all key-value pairs

Example:
- Original size: 32 buckets
- After grow(): 64 buckets

Reduces collisions and increases performance

------------------------------------------------------
 6. Final Output
------------------------------------------------------

System.out.println(myMap.get("apple"));   // 100
System.out.println(myMap.get("banana"));  // 20
System.out.println(myMap.get("grape"));   // null (was removed)
*/


import java.util.Random;

class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
    
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
    
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
    
        return null;
    }
    
private List<Pair<K, V>> getListBasedOnKey(K key) {
    int hashValue = Math.abs(key.hashCode() % values.length);
    if (values[hashValue] == null) {
        values[hashValue] = new List<>();
    }

    return values[hashValue];
}

private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
    for (int i = 0; i < myList.size(); i++) {
        if (myList.value(i).getKey().equals(key)) {
            return i;
        }
    }

    return -1;
}
public void add(K key, V value) {
    List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
    int index = getIndexOfKey(valuesAtIndex, key);

    if (index < 0) {
        valuesAtIndex.add(new Pair<>(key, value));
        this.firstFreeIndex++;
    } else {
        valuesAtIndex.value(index).setValue(value);
    }
    if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
        grow();
    }
}
private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
    if (this.values[fromIdx] == null) {
        return;
    }
    for (int i = 0; i < this.values[fromIdx].size(); i++) {
        Pair<K, V> value = this.values[fromIdx].value(i);

        int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
        if(newArray[hashValue] == null) {
            newArray[hashValue] = new List<>();
        }

        newArray[hashValue].add(value);
    }
}
private void grow() {
    // create a new array
    List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

    for (int i = 0; i < this.values.length; i++) {
        // copy the values of the old array into the new one
        copy(newArray, i);
    }

    // replace the old array with the new
    this.values = newArray;
}
public V remove(K key) {
    List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
    if (valuesAtIndex.size() == 0) {
        return null;
    }

    int index = getIndexOfKey(valuesAtIndex, key);
    if (index < 0) {
        return null;
    }

    Pair<K, V> pair = valuesAtIndex.value(index);
    valuesAtIndex.remove(pair);
    return pair.getValue();
}
}
class Pair<K,V>
{
    private K key;
    private V value;
    Pair(K key,V value){
        this.key=key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    
}
public class HashMapWithGeneric {
    public static void main(String[] args) {
//         List<String> myList = new List<>();
// HashMap<String, String> hashMap = new HashMap<>();

// for (int i = 0; i < 1000000; i++) {
//     myList.add("" + i);
//     hashMap.add("" + i, "" + i);
// }

// List<String> elements = new List<>();
// Random randomizer = new Random();
// for (int i = 0; i < 1000; i++) {
//     elements.add("" + randomizer.nextInt(2000000));
// }

// long listSearchStartTime = System.nanoTime();
// for (int i = 0; i < elements.size(); i++) {
//     myList.contains(elements.value(i));
// }
// long listSearchEndTime = System.nanoTime();

// long hashMapSearchStartTime = System.nanoTime();
// for (int i = 0; i < elements.size(); i++) {
//     hashMap.get(elements.value(i));
// }
// long hashMapSearchEndTime = System.nanoTime();


// long listSearch = listSearchEndTime - listSearchStartTime;
// System.out.println("List: the search took about " + listSearch / 1000000 + " milliseconds (" +
//     listSearch + " nanoseconds.)");

// long hashMapSearch = hashMapSearchEndTime - hashMapSearchStartTime;
// System.out.println("Hash map: the search took about " + hashMapSearch / 1000000 +
//     " milliseconds (" + hashMapSearch + " nanoseconds.)");

HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.add("apple", 10);   // adds ("apple", 10)
        map.add("banana", 20);  // adds ("banana", 20)
        map.add("grape", 30);   // adds ("grape", 30)

        // Get values
        System.out.println(map.get("apple"));  // Output: 10
        System.out.println(map.get("banana")); // Output: 20

        // Update value
        map.add("apple", 100); // Updates value of "apple" to 100
        System.out.println(map.get("apple"));  // Output: 100

        // Remove a key
        map.remove("grape"); // Removes ("grape", 30)
        System.out.println(map.get("grape"));  // Output: null

        // Try to get non-existent key
        System.out.println(map.get("orange")); // Output: null
    }
}
