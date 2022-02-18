/*Polymorphism allows to perform single action in different ways.
  2types 
  compiletime polymorphism - achieved by Method Overloading(When there are multiple functions with the same name 
  but different parameters then these functions are said to be overloaded. 
  ->Multiple methods can have same name but different numberof arguments.
  ->Multiple methods can have same name and same number of arguments but the arguments are of different types.)
  
  runtime polymorphism - 

 */
//compile time polymorphism
class polymorph
{
  //Method overloading with different number of arguments
  public static void printDiscount(int first,int second,int third)
  {
    int amount = first+second+third;
    double discount = amount * 10/100;
    System.out.println(discount);
  }

  public static void printDiscount(int first,int second)
  {
    int amount = first+second;
    double discount = amount * 10/100;
    System.out.println(discount);
  }

  //Method overloading with different types of arguments
  public static void diffType(int a,double b)
  {
    System.out.println("sum = "+a+b);
  }

  public static void diffType(String name,int no)
  {
    System.out.println(name+no);
  }

  public static void main(String[] args)
  {
    printDiscount(500,1000,2000);
    printDiscount(200,400);

    diffType(2,2.5);
    diffType("Some",20);
  }
}
