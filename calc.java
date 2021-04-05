import java.util.Scanner;
class Calc {
    public static void main(String[] args) {
        //int Fnum,Snum;
        int operation;
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();*/
        System.out.println("Following operations can be performed" + ":\n1.Sum \n2.Subtrction \n3.Multiplication \n4.division \n5.Remainder\n");
        System.out.print("Enter operation: ");
        operation = sc.nextInt();
        switch(operation) {

            case 1 :
                sum();
		        break;
		    case 2 :
				sub();
		        break;
			case 3 :
				mult();
				break;
			case 4 :
				div();
				break;
			case 5 :
				remainder();
				break;
			default:
				System.out.println("Invalid operation");
        } 
        sc.close();
		
    }
     public static void sum(){
        int Fnum,Snum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
	    System.out.println("\nResult: = " + (Fnum + Snum));
    }
	public static void sub(){
        int Fnum,Snum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
	    System.out.println("\nResult: = " + (Fnum - Snum));
    }
    public static void mult(){
         int Fnum,Snum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
	    System.out.println("\nResult: = " + (Fnum * Snum));
    }
    public static void div(){
        int Fnum,Snum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
        try {
			System.out.println("Result = "+ (Fnum/Snum));
		}
		catch (ArithmeticException e) {
			System.out.println("Divided by zero operation cannot possible");
		}
    }
    public static void remainder(){
        int Fnum,Snum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        Fnum = sc.nextInt();
        System.out.println("Enter Second Number: ");
        Snum = sc.nextInt();
	    System.out.println("\nResult: = " + (Fnum % Snum));
    }
}