package obj2.s4;

/**
 * Created by Anca on 25-Oct-15.
 */
public class ConstantSpecificClassBodyEnum {
    public static void main(String[] args) {
        System.out.println(IceCream.STRAWBERRY.toString());
        System.out.println(IceCream.CHOCOLATE.toString());
        System.out.println();
    }
}
enum IceCream{

    VANILLA("white"),
    //when an enum constant overides an enum method
    //the enum constant creates an anonymous class
    //which extends the enum
    STRAWBERRY("pink"){
        public String toString(){
            return "I love STRAWBERRY ice cream";
        }
        //inner classes cannot have static declarations
/*`        public static IceCream[] values(){
            return null;
        }*/
    },
    CHOCOLATE("drak_brown");
    private String color;
    //an enum can't define a constructor with public or protected access
    IceCream(String color){
        this.color = color;
    }
    public String toString(){
        return color;
    }

    public static void main(String[] args) {
        System.out.println(CHOCOLATE);
    }

}