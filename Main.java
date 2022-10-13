import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Year: ");
        year = inp.nextInt();
        int residual1 = year %4;
        int residual2 = year % 100;
        if(residual1==0) {
            if (residual2 == 0 ) {
                int residual3 = year %400;
                if (residual3==0) {
                    System.out.print(year + " is a residual year.");
                } else {
                    System.out.print(year + " is not a residual year.");
                }
            }
            
        } else {
            System.out.print(year + " is not a residual year.");
        }















    }
}