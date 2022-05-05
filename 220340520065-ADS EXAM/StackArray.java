import java.util.*;

class Array1{
	int top1, top2;
	int max ;
	int arr [];
	 Array1(int n){
		max =n;
		arr = new int[n];
		top1 = (n/2+1);
		top2 = n/2;
	 }
	 void push1(int a)
	 {
		if(top1>0)
		{
			top1--;
			arr[top1]=a;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	 }
	 void push2(int a)
	 {
		 if(top2<max-1)
		{
			top2++;
			arr[top2]=a;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	 }
	 int pop1()
	 {
		if(top1<=max/2) 
		{
			int a = arr[top1];
			top1++;
			return a;
		}	
		else
		{
		System.out.println("Stack underflow");	
		}
		return 0;
	 }
	 
	 int pop2()
	 {
		if(top2>=(max/2)+1) 
		{
			int a = arr[top2];
			top2--;
			return a;
		}	
		else
		{
		System.out.println("Stack underflow");	
		}
		return 0;
	 }
}
class StackArray{	 
public static void main(String args[]){

	Array1 a1 = new Array1(10);
		a1.push1(5);
		a1.push2(10);
		a1.push2(15);
		a1.push1(11);
		a1.push2(7);
		a1.push2(40);
		
		System.out.println("Popped element from stack1 is "+a1.pop1());
		System.out.println("Popped element from stack2 is "+a1.pop2());
	}
}