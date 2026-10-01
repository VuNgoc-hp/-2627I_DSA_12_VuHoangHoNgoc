import java.util.Arrays;
import java.util.Scanner;

public class w4_tailop_25021916{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] citations =new int[n];

        for (int i=0;i<n;i++){
            citations[i]=sc.nextInt();
        }
        Arrays.sort(citations);

        int hIndex=0;
        for ( int i=n-1;i>= 0;i--){
            if (citations[i]>hIndex){
                hIndex++;
            }else{
                break;}
        }
        System.out.println(hIndex);
        sc.close();
    }
}