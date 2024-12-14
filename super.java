import java.util.*;
class a{
    public void r(){
        System.out.println("hello");
    }
}
class b extends a{
    public void r1()
    {
        super.r();
        System.out.println("hello students");
    }
}
class main{
    public static void main(String[] args){
        b h=new b();
        h.r1();
    }
}