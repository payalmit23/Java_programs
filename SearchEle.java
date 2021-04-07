// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class SearchEle{
    public static void main(String[] args) {
        int n,search_key;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of elements");
        n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)
        { 
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element you want to search");
        search_key=sc.nextInt();
        for(int i=0;i< n;i++){
            if(arr[i]==search_key){
                System.out.println("Found");
                break;
            }
        }
        return;
    }
}
