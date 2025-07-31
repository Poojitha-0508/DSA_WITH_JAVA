// FIND THE MINIMUM ELEMENT IN THE GIVEN ARRAY

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
        int min=Integer.MAX_VALUE;

        for (int[] i:arr){
            for (int element:i){
                if (min>element){
                    min=element;
                }
            }
        }
        System.out.println(min);
    }
}
