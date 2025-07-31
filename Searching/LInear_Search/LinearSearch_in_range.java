// SEARCH FOR AN ELEMENT WITHIN A SPECIFIED RANGE IN THE ARRAY 


import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int START=in.nextInt();
        int END=in.nextInt();
        int key=in.nextInt();
        int flag=-1;
        for(int i=START-1;i<END+1;i++){
            if (arr[i]==key){
                flag=i+1;
                break;
            }
        }
        if (flag!=-1){
            System.out.println("ELEMENT FOUND AT "+flag+"th position");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
