// LINEAR SEARCH FOR AN ELEMENT IN 2D ARRAYS

// SEARCH IN 2D arrays

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }        
        }
        int key=in.nextInt();
        boolean flag=false;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]==key){
                    flag=true;
                    break;
                }      
            }        
        }
        if (flag==true){
            System.out.println(key+" ELEMENT FOUND");
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
