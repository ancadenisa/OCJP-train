package obj2.s3;

/**
 * Created by Anca on 10-Oct-15.
 */
public class FinalAssignments {
    final int finalVar;
    FinalAssignments(int a, int b){
        if(a>b){
            finalVar = 0;
        }
        else if(b>=a){
            finalVar = 3;
            //without else block this code would not have been able to complie because the compiler cannot figure out
            // if the final variable will be initialized
        }else{
            finalVar = 2;
        }
    }
    //if the given constructor below is decommented the code will not compile
    //because the compile cannot figure out which constructor will be called
    //in order to be sure that the final variable will be initialized
   /* FinalAssignments(){
    }
   */
}
