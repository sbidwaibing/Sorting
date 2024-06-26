package opx;

public class consoleOutput 
{
    public static void printArr(int[] _arr)
    {
        int[] arr = _arr;
        int n = arr.length;

        System.out.println();
        System.out.println("Sorted Array:");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println();
    }    
}
