import java.util.*;
class main{
    public static void main(String[] args){
        //try - catch
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("bad request");
        }
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("catch is runing");
        }finally{
            System.out.println("finnally we are back");
        }
    }
}