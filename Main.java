import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    problem1();
    problem2();

    // write solutions to problems here
  }
  public static void problem1() 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a double ");
    double num = scan.nextDouble();
    if (num == 12.345)
    {
      System.out.println("YES");
    }
  }

  public static void problem2() 
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a int ");
    int num = scan.nextInt();
    if (num == 48)
    {
      System.out.println("YES");
    }
  }
}
