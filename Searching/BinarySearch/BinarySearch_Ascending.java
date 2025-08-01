// SEARCH FOR AN ELEMENT IN THE GIVEN ARRAY(ELEMENTS ARE IN INCREASING ORDER) USING BINARY SEARCH


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr = new int[n];
	    for (int i=0;i<n;i++){
	        	arr[i]=in.nextInt();
		}
		int key=in.nextInt();
	    System.out.println(BinarySearch(arr,key));
	}
	static int BinarySearch(int[] arr,int key){
		int low=0,high=arr.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if (arr[mid]>key){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		return -1;
	}
}
