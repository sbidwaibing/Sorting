package driver;

import ipx.userInput;
import logicx.SortLogic;
import opx.consoleOutput;

public class Driver 
{
    public static void main(String[] args) 
    {
        int[] arr = userInput.readArray();

        SortLogic s1 = new SortLogic();
        s1.sortArr(arr);

        consoleOutput.printArr(arr);
    }    
}
