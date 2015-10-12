package obj2.s1and2;

/**
 * Created by Anca on 10-Oct-15.
 */
abstract class StaticAndAbstrac {
    public static int x = 7;
    protected static int y = 9;
    //illgal combination
    //public abstract static int  method1();

}

class C1 extends  StaticAndAbstrac{

    public static void main(String[] args) {
        StaticAndAbstrac s =  new C1();
        y = 7;//cant say s.y(by reference)

    }
}