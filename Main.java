import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);

    //3
    /*System.out.println("enter a num between 0-50");
    int num = sc.nextInt();

    if (num <=0 || num >= 50)
    {
      System.out.println("error");
      
    }
    else
    {
      for (int count = num; count <= 50; count++)
      {
        System.out.print(count + " ");
        
        if (count % 5 == (num+4) % 5)
        {
          System.out.println();
          
        }
      }
    }*/
    int n = sc.nextInt();
     if (n > 0)
    {
  
      n -= (n % 3);	
      for (int i = n; i >= 0; i -= 3)
      {
        System.out.print(i + " ");
      }
    }
    else
    {
      System.out.println("error");
    }
          
  }

}
