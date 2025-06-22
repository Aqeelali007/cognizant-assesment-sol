import java.util.Scanner;

public class financeForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter principal amount");
        float amt = scan.nextInt();
        System.out.println("Enter rate of interest in %");
        int r = scan.nextInt();
        System.out.println("Enter term");
        int n = scan.nextInt();

        scan.close();

        float ans = finalAmt(amt,r,n);
        System.out.printf("Future value after %d years is: %.2f\n", n, ans);
    }
    static float finalAmt(float amt,int r,int n){
        if(n==0){
            return amt;
        }
        amt = amt * (1 + (float)r/100);
        return finalAmt(amt, r, n-1);
    }
}
