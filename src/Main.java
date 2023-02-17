import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] a = new double[n];
        for(int i = 0;i < n; i++){
            a[i] = input.nextInt();
        }
        int max = 0;
        for(int i = 0;i < n; i++){
           if(max < a[i]){
                max = (int)a[i];
           }
        }
        for (int i = 0; i < n; i++){
            System.out.printf("%.2f ", a[i] / max);
        }
    }
}