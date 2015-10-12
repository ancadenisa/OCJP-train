package obj2.s3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Anca on 10-Oct-15.
 */

public class StaticContext {
    static{
       // d++; //illegal forward reference
    }
    static int d;
    //static int x = count(); //method count cannot be rffered from a static context
    public int count(){
        return 5;
    }
}
 class AffiliateProgram{
     //private  static  int accountOpenBonus = initAccountOpenBonus(); //cant initialialize variable with the return value of a method that throws checked exception
     private static int accountOpenBonus;
     static {
         try{
             FileInputStream f = new FileInputStream(File.createTempFile("aa", "mat"));
         }catch (IOException i){
             System.out.println("uuuuu");
         }
         accountOpenBonus = 4;
     }
     private static int initAccountOpenBonus() throws FileNotFoundException{
         return 3;
     }
 }