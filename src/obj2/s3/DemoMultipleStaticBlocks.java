package obj2.s3;

/**
 * Created by Anca on 10-Oct-15.
 */
public class DemoMultipleStaticBlocks {
    static{
        staticVar = 9; // it is not forward reference because compiler rearranges the code = > it will print 1
        //staticVar++; //forward reference - tries to use it before declaring
    }
    static int staticVar;
    static{
        ++staticVar;
    }

    public DemoMultipleStaticBlocks(){
        System.out.println("Constructor " +  staticVar);
    }

    public static void main(String[] args) {
        new DemoMultipleStaticBlocks();
    }
}
