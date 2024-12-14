import java.util.*;
class main{ 
    public static void a(int a,int b){
        if(b==0)
        {   
            throw new ArithmeticException ("cannot divide");
        }
        System.out.println(a/b);
    }
    public static void main(String[] args){
        //try - catch
        try{ 
            a(10,0);
        }catch( ArithmeticException v)
        {
            System.out.println(v.getMessage());
        }
        
    }
}