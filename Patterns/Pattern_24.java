import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
        for(int i=1;i<=(2*n);i++){
            for (int j=1;j<=(2*n);j++){
                if(j==1 || j==(2*n)){
                    System.out.print("*");
                }
                else if(j==i){
                    System.out.print("*");
                }
                else if(j+i==(2*n)+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

                }
            }
            System.out.println ();
        }
    }
}
