import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;
        int sum = 0;
        for( i =0;i<=n;i+=3){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
