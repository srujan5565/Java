public class StringPool {
    public static void main(String[] args) {
        String a=new String("abc");
        String b=new String("abc");
        String c = "abc";
        String d = "abc";
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
/*
 String a = new String("abc");
This creates a new String object in heap, even though "abc" is already in the string pool.

So a points to a heap object.

🟢 String b = new String("abc");
Another new String object, also in heap.

b points to a different heap object, though contents are same.

✅ a == b → false
Because a and b point to two different objects in memory.

Even though a.equals(b) would return true, a == b returns false.

🟢 String c = "abc";
🟢 String d = "abc";
Both are string literals, and Java stores string literals in a String pool (interning).

If the same literal appears again, Java reuses the reference.

✅ c == d → true
Because both point to the same memory in the string pool — they are interned. 
 
 */