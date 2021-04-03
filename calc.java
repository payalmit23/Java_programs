import java.util.Scanner;
class Calc {
    public static void main(String[] args) {
        int Fnum,Snum;
        int operation,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
        System.out.println("Following operations can be performed" + ":\n1.Sum \n2.Subtrction \n3.Multiplication \n4.division \n5.Remainder");
        System.out.print("Enter operation: ");
        operation = sc.nextInt();
        switch(operation) {

            case 1 :
                System.out.println("Result = "+ (Fnum+Snum));
		        break;
		    case 2 :
				System.out.println("Result = "+ (Fnum-Snum));
		        break;
			case 3 :
				System.out.println("Result = "+ (Fnum*Snum));
				break;
			case 4 :
				try {
						System.out.println("Result = "+ (Fnum/Snum));
				}
				catch (ArithmeticException e) {
					System.out.println("Divided by zero operation cannot possible");
				}
				break;
			case 5 :
				System.out.println("Result = "+ (Fnum%Snum));
				break;
			default:
				System.out.println("Invalid operation");
        } 
        sc.close();
    }
}