package MyPkg;

public class MyCalc {
	public int sum(int a , int b) 
	{
		return(a + b);
	}
	public int dif(int a , int b)
	{
		return (a - b);
	}
	public void display()
	{
		System.out.println("Hello Dev Branch");
	}
	public void show()
	{
		System.out.println("This is Dev Branch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc calc = new MyCalc();
		System.out.println("Sum is : " + calc.sum(20 , 10));
		System.out.println("Difference is : " + calc.dif(20 , 10));
		calc.show();
		calc.display();
	}

}
