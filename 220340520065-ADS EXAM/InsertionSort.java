import java.util.*;
class InsertionSort{
	
	public static void insertionSort(int arr[],int n){
		
		for(int i=n-1;i>=0;i--){ //2 4 6 8 3
			int key = arr[i];//8
			int j= i-1;//4
			while(j>=0 && arr[j]>key){//8>3
				arr[j+1]=arr[j];//arr[4]=8
				j= j-1;//3
				for(int k: arr){
			System.out.print(k+" ");
			}
			System.out.println();
		}
			arr[j+1]=key;
			//System.out.println("after pass- array");
			
		}
		for(int k: arr){
			System.out.print(k+" ");				
			}
		
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
		}
		insertionSort(arr,n);
	}
	
	
}