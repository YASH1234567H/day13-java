import java.util.*;
class a{
    public void pl(){
        System.out.println("hlo i am yashwanth");
    }
}
class b extends a{
    public void  r(){
        System.out.println("hlo nava");
    }
}
class main{
    public static void main(String[] args){
        a h=new a();
        h.pl();
        b  y=new b();
        y.pl();
        y.r();
    }
}