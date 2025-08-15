// SEARCH FOR A ELEMENT IN AN 1D ARRAY AND RETURN TRUE IF FOUND

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int key=in.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if (arr[i]==key){
                flag=true;
                break;
            }
        }
        if (flag==true){
            System.out.println("ELEMENT FOUND");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
