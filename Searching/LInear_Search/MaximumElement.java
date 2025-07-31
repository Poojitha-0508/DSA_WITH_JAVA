// FIND THE MAXIMUM ELEMENT IN THE GIVEN ARRAY USING LINEAR SEARCH

// SEARCH IN A RANGE

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
        int max=Integer.MIN_VALUE;

        for (int[] i:arr){
            for (int element:i){
                if (max<element){
                    max=element;
                }
            }
        }
        System.out.println(max);
    }
}
