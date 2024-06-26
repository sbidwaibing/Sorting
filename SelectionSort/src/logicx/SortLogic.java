package logicx;

public class SortLogic 
{
    public void sortArr(int[] _arr)
    {
        int[] arr = _arr;
        int size = arr.length;

        for(int i=0; i<=size - 2; i++)
        {
            int min = i;      
            
            for(int j=i; j<=size-1; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }    
}
