//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("Base Salary: "+baseSalary);
  }
}
class CSE
{
  public void salary(int baseSalary)
  {
    System.out.println("CSE Faculty: "+ (baseSalary+3000));
  }
}
class IT
{
  public void salary(int baseSalary)
  {
    System.out.println("IT Faculty: "+ (baseSalary+5000));
  }
}
class ECE
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+ (baseSalary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int baseSalary=in.nextInt();
    if(baseSalary>0)
    {
    Faculty obj1=new Faculty();
    obj1.salary(baseSalary);
    CSE obj2=new CSE();
    obj2.salary(baseSalary);
    IT obj3=new IT();
    obj3.salary(baseSalary);
    ECE obj4=new ECE();
    obj4.salary(baseSalary);
    }
    else
    {
      System.out.println("null");
    }
  }
}