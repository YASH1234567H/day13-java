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
class c extends a{
    public void  r1(){
        System.out.println("hlo anime");
    }
}
class main{
    public static void main(String[] args){
        c h=new c();
        h.r1();
        h.pl();
        b f=new b();
        f.r();
        f.pl();
    }
}