package obj1.s6;

/**
 * Created by Anca on 04-Oct-15.
 */
public class EqualsOverloading {
}

class Course{
    String title;

    public Course(String title) {
        this.title = title;
    }

    public boolean equals(Course o){
        return title.equals(o.title);
    }

    public static void main(String[] args) {
        Object o1 = new Course("ejava");
        Object o2 = new Course("ejava");
        System.out.println(o1.equals(o2)); //returns false because it calls the inheritted method equals


    }
}