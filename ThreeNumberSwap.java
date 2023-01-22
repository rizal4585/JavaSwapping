package swap;

public class threeNumberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//before swap
		
		int a=1;
		int b=2;
		int c=3;
		
		a=a+b;//3
		b=a-b;//3-2=1
		c=a-b;//3-1=2
		a=b+c;//2+1=3

		//after swap
		
		System.out.println("A=" + a + " B=" + b + " C=" + c);