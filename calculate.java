import java.util.*;
class calculate
{
      public static void main(String[]args)
	  {
	  Scanner sc = new Scanner(System.in);
	   System.out.println("enter the first number");
	  int i=sc.nextInt();
	  System.out.println("enter the second number");
	  int j=sc.nextInt();
	  System.out.println("select operator");
	      System.out.println("enter 1 for add");
		  System.out.println("enter 2 for sub");
		  System.out.println("enter 3 for mul");
		  System.out.println("enter 4 for div");
		  System.out.println("enter 5 for exit");
		  int num=sc.nextInt();
	  
	  switch(num)
	  {
		  case 1:
		  {
		  num=i+j;
		  System.out.println("Result:"+num);
		  break;
	  }
		  case 2:
		  {
		  num=i-j;
		  System.out.println("Result:"+num);
		  break;
		  }
		  case 3:
		  {
		  num=i*j;
		  System.out.println("Result:"+num);
		  break;
		  }
		  case 4:
		  {
		  num=i/j;
		  System.out.println("Result:"+num);
		  break;
		  }
		  case 5:
		  System.exit(0);
		  
	  
	  }
	  }
}
		  