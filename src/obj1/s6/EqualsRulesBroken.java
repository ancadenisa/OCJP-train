package obj1.s6;

/**
 * Created by Anca on 04-Oct-15.
 */
public class EqualsRulesBroken {
}


class Course1{
    String title;
    Course1(String title){
        this.title  = title;
    }
    public  boolean equals(Object o){
        return  title.equals(o);
    }

}

class University{
    public static void main(String[] args) {
        Course1 c1 =  new Course1("aaa");
        String s1 =  "aaa";
        System.out.println(c1.equals(c1));//breal of reflexive
        c1.equals(s1);
        s1.equals(c1); //break of symetric
    }
}