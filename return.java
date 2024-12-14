import java.util.*;
class library{
String name;
int bbr;
library(String name)
  {
    this.name=name;
    this.bbr=0;
  }
  public void rbob()
  {
    if(bbr>0)
    {
      bbr--;
      System.out.println(name+" You have to return "+bbr+" books ");
    }else{
      System.out.println(name +" You have no books to return ");
    }
  }
}
class students extends library
{
  students(String name)
  {
    super(name);
  }
}
class teachers extends library
{
  teachers(String name)
  {
    super(name);
  }
}
class main {
  public static void main(String[] args) {
      library a = new students("yash");
      a.bbr=2;
      library b1 = new students("nava");
      library b = new teachers("hod");
      a.rbob();
      b1.rbob();
      b.rbob();
  }
}