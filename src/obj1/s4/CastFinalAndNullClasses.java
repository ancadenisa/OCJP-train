package obj1.s4;

import jdk.nashorn.internal.ir.EmptyNode;

/**
 * Created by Anca on 04-Oct-15.
 */
public class CastFinalAndNullClasses {

    public static void main(String[] args) {
        Engineer engineer =  new Engineer();
        Printable printable = (Printable)engineer; //uncomment final from class engineer and it won't work
        Engineer engineer1 =  (Engineer)null; //you can cast null to any type you like -- it won't generate compilation errors or exceptions at runtime
    }
}

interface  Printable{}

/*final */class Engineer{

}

