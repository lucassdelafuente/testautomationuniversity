package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String args[]){
        setDemo();
        // listDemo();
        // queueDemo();
        // mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //System.out.println(fruit.size()); //4
        //System.out.println(fruit);

        //One approach
        Iterator i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        /* Other approach - It's necessary that you have Set<String>
         * - That's because Collections are generic, in that they just store an Object, and since Object is the grandparent to every class in Java, then that is safe to use.
         *   If we wanted to be more specific, and we wanted to say that this was holding Strings, we could do that with this diamond operator, which is essentially just two angle brackets (<>).
        */
        for(String item : fruit){
            System.out.println(item);
        }

        // Other aprroach, you can use LAMBDA EXPRESSION
        fruit.forEach(x -> System.out.println(x));
        //OR
        fruit.forEach(System.out::println);

    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]

        fruit.remove();
        System.out.println(fruit);//[lemon, banana, orange, lemon]

        System.out.println(fruit.peek());//lemon
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 95);
        fruitCalories.put("banana", 95);
        fruitCalories.put("orange", 95);

//        System.out.println(fruitCalories.size()); //4
//        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, orange=95}
//
//        System.out.println(fruitCalories.get("lemon")); //95
//
//        System.out.println(fruitCalories.entrySet());
//
//        fruitCalories.remove("orange");

        for(Map.Entry entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        //Other approach
        fruitCalories.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v)
        );
    }

    public void print(Collection<String> collection){
        Iterator i = collection.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String item : collection){
            System.out.println(item);
        }

        collection.forEach(System.out::println);
    }

    public void print(Map<String, Integer> map){
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue());
        }

        map.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
