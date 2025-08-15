import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
	    
		System.out.println(Arrays.toString(cycleSort(arr)));
	}
	static int[] cycleSort(int[] arr){
	    int i=0;
	    while(i<arr.length){
	        int correct=arr[i]-1;
	        if(arr[i]!=arr[correct]){
	            int temp=arr[i];
	            arr[i]=arr[correct];
	            arr[correct]=temp;
	        }
	        else{
	            i++;
	        }
	    }
	    return arr;
	}
}
