package ipx;

import java.util.Scanner;

public class userInput 
{
    public static int[] readArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Size of an Array:"+" ");
        int n = scanner.nextInt();
            
        System.out.println("Size of Array is: " + n);
        System.out.println();
        
        int arr[] = new int[n];

        System.out.println("Enter the Elements of an Array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("Entered Array Elements: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        scanner.close();  
        
        return arr;
    }   
}
