package obj2.s3;

/**
 * Created by Anca on 11-Oct-15.
 */
public class TwistInTheTale {
    {
        System.out.println(new MyDerivedClass().finalVar);
    }
    public static void main(String[] args) {
        new TwistInTheTale();
    }
}

abstract class MyClass{
    public final int finalVar =2; //cannot be left uninitialized
}
class MyDerivedClass extends MyClass{
    MyDerivedClass(){
        super();
        //finalVar = 2000; //cannot initialize final variable in subclass
    }
}
