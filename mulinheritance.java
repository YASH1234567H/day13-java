import java.util.*;
interface a{
    public void pl();
}
interface b {
    public void  r();
    
}
class c implements a,b{                     
    public void  pl(){
        System.out.println("hlo anime");
    }
    public void  r(){
        System.out.println("hlo ");
    }
}
class main{
    public static void main(String[] args){
        c h=new c();
        h.pl();
        h.r();
    }
}