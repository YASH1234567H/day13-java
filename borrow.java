import java.util.*;
class library{
String name;
int bb;
library(String name)
  {
    this.name=name;
    this.bb=0;
  }
  public boolean cb()
  {
    return false;
  }
  public void bob()
  {
    if(cb())
    {
      bb++;
      System.out.println(name+" You borrowed "+bb+" books ");
    }else{
      System.out.println("Your Limit Exceeded!!");
    }
  }
}
class students extends library
{
  students(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<3;
  }
}
class teachers extends library
{
  teachers(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<10;
  }
}
class main {
  public static void main(String[] args) {
      library a = new students("yash");
      library b1 = new students("nava");
      library b = new teachers("hod");
      b1.bob();
      a.bob();
      a.bob();
      b.bob();
  }
}