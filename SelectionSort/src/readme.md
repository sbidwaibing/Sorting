# Array Sorting Program

This Java program reads an array of integers from the user, sorts the array using selection sort, and prints the sorted array to the console. The program is structured into different packages for input, sorting logic, and output, making it modular and easy to understand.

## Project Structure

The project is organized into the following packages:

- `driver`: Contains the main driver class to run the program.
- `ipx`: Contains the class for reading user input.
- `logicx`: Contains the sorting logic.
- `opx`: Contains the class for printing output.

## Files

- `driver/Driver.java`: The main class to run the program.
- `ipx/userInput.java`: Reads the array size and elements from the user.
- `logicx/SortLogic.java`: Implements the selection sort algorithm.
- `opx/consoleOutput.java`: Prints the sorted array to the console.
- `Makefile`: Defines rules for compiling, running, and cleaning the project.

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed.
- A terminal or command prompt.
- GNU Make (optional, for using the Makefile).

### Steps

1. **Compile the Program**:
   You can compile the program using the Makefile provided. Open your terminal or command prompt and navigate to the project directory. Make sure you are at the src directory level, and then use the following following command to compile and Run the code.

   $ make       : To compile the code
   $ make run   : To execute the code
   $ make clean : To clean and delete the .class files.

### Executing SS of the code
Enter the Size of an Array: 5
Size of Array is: 5

Enter the Elements of an Array: 
4
2
5
1
3

Entered Array Elements: 
4    2    5    1    3    

Sorted Array:
1    2    3    4    5    

Notes
The program uses a simple selection sort algorithm, which is suitable for small arrays.
Ensure you have the necessary Java development tools installed on your system.
The Scanner for reading input is closed after reading the array elements. If you need to extend the program to read more inputs, consider managing the Scanner instance accordingly.

## License

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

### Enjoy sorting your arrays!