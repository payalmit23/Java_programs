import java.util.Scanner;
class Addition {
    public static void main(String[] args) {
      int Fnum1, Snum2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        Fnum1 = sc.nextInt();
        System.out.println("Second Number: ");
        Snum2 = sc.nextInt();
        sc.close();
        sum = Fnum1 + Snum2;
        System.out.println("Sum of these numbers: "+sum);
    }
}