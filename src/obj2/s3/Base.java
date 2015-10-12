package obj2.s3;

/**
 * Created by Anca on 11-Oct-15.
 */
public class Base {
    private final void method1(){}
}

class Derived extends Base{
    private void method1(){
        //you may think that this method is not allowed because final methods cannot be overriden,
        //but it is actually a NEW method. Since it is marked private in the base class, ther
        //derived cladd doesn't inherit it
    }
}
