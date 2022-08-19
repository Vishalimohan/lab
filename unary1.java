class unary1
{
	public static void method1(int a)
	{
		System.out.println("------Unary Operator------");
		System.out.println("The value of a is:" + a);
		System.out.println("Post Increment of a is:" + a++);
		System.out.println("Post Decrement of a is:" + a--);
		System.out.println("Pre Decrement of a is :" + --a);
		System.out.println("Pre Increment of a is :" + ++a);
		System.out.println(" ");
		
	}
	 
	public static void method1(int a, int b, int c)
	{
		System.out.println("------Logical Operator------");
		boolean value1=(a>b)&&(b<c)&&(c>a);
		System.out.println(" The result of Logical AND is:" +value1);
		
		boolean value2=(a<b)||(b<c)||(c>a);
		System.out.println(" The result of Logical OR is:" +value2);
		
		boolean value3=(a>b)&& (b>c)||(a==b)&&(c>a);
		System.out.println(" The result of Logical AND and OR is:" +value3);
		
		boolean value4=(!(a<c));
		System.out.println(" The result of Logical NOT is:" +value4);
		System.out.println(" "); 
		
	}
	public static void method2(int a, int b)
	{
		
		System.out.println("------Assignment Operator------");
		
		b+= a;
		System.out.println("b += " + b);
		
		b -= a;
		System.out.println("b -= " + b);
		
		b *= a;
		System.out.println("b *= " + b);
		
		b /= a;
		System.out.println("b /= " + b);
		
		b %= a;
		System.out.println("b %= " + b);
		System.out.println(" ");
		
	}
	public static void method3(int a,int b)
	{
		System.out.println("------Relational operator------");
		System.out.println("a is " + a  + " and b  is " + b);
		System.out.println("The value of a== b:"+( a == b));
		System.out.println("The value of a!= b:"+( a != b));
		System.out.println("The value of a>b:"+( a > b));
		System.out.println("The value of a< b:"+( a < b));
		System.out.println("The value of a>= b:"+( a >= b));
		System.out.println("The value of a<= b:"+( a <= b));
		System.out.println(" ");
	}
	public static void method4(int a)
	{
		System.out.println("------Arithmetic operator------");
		System.out.println("The value of a+2:" + (a+2));
		System.out.println("The value of a-2:" +(a-2));
		System.out.println("The value of a*2:" +(a*2));
		System.out.println("The value of a/2:" +(a/2));
		System.out.println("The value of a in Float:" +(((float)a)/2));
		System.out.println("The value of a in Decimal:" +(((double)a)/2));
	}
	
	public static void main(String[]args)
	{
	
		method1(20);
		method1(10,30,50);
		method2(20,40);
		method3(50,30); 
		method4(15);
		
		
		
	}
	
}