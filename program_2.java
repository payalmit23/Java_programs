// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Addition {
    public static void main(String[] args) {
      int Fnum1, Snum2, sum,sub,mult,div,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        Fnum1 = sc.nextInt();
        System.out.println("Second Number: ");
        Snum2 = sc.nextInt();
        sc.close();
        sum = Fnum1 + Snum2;
        System.out.println("Sum of these numbers: "+sum);
        sub = Fnum1 - Snum2;
        System.out.println("Subtraction of these numbers: "+sub);
        mult = Fnum1 * Snum2;
        System.out.println("Multiplication of these numbers: "+mult);
        rem = Fnum1 % Snum2;
        System.out.println("Remainder of these numbers: "+rem);
        div = Fnum1 / Snum2;
        System.out.println("Division of these numbers: "+div);
    }
}