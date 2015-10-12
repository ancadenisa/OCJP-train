package obj1.s6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anca on 04-Oct-15.
 */
public class HashCodeRuleBroken {
}

class MyNumber{
    int p, s;

    public MyNumber(int p, int s) {
        this.p = p;
        this.s = s;
    }

    @Override
    public int hashCode() {
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyNumber myNumber = (MyNumber) o;

        if (p != myNumber.p) return false;
        return s == myNumber.s;

    }

    public static void main(String[] args) {
        Map<MyNumber, String> map = new HashMap<>();
        MyNumber num1  =  new MyNumber(1, 2);
        MyNumber num2 = new MyNumber(1, 2);
        System.out.println(num1.equals(num2));
        map.put(num1, "Ssst");
        System.out.println(map.get(num1));
        System.out.println(map.get(num2)); //prints false because hashes of num1 and num2 are different even though they are equal

        //it is recommended to override hashcode based in immutable objects

        num1.s  = 4;

        System.out.println(map.get(num1));

        //on the job! storing entities from fb in a collection that uses hashing and then modifying those entities
        //might cause retrieval of null object from the collection
    }
}
