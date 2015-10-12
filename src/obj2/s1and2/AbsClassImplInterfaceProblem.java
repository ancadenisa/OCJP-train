package obj2.s1and2;

/**
 * Created by Anca on 10-Oct-15.
 */
public class AbsClassImplInterfaceProblem {
}

interface Live{
    boolean eat();
}

abstract class Animal implements  Live{
    //the above row is incorrect beacause method with the same name in an abstract subclass
    //as in its interface that it implements should either comply with the correct
    //overiding or overloading or else the class won't compile
    //public abstract void eat();
}