import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = inp.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i+1); j++) {
                System.out.print(j+1);
            }
            for(int j = 0; j < i; j++) {
                System.out.print(i-j);
            }
            System.out.println();
        }
    }
}