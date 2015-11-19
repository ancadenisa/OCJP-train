package obj2.s4;

/**
 * Created by Anca on 18-Oct-15.
 */
public enum Level {
    BEGINNER;
    static{
        System.out.println("static init block");
    }

    Level(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        //by default methods name() and toString() return the same
        //thing,  the private variable name
        System.out.println(Level.BEGINNER);
        System.out.println(Level.BEGINNER.name());
    }
}
