# Sorting
Implementation of vital sorting techniques in Java

## Sorting Algorithms Covered
--------------------------------------------------------------------------------------

1. Selection Sort:
   Selection sort is a simple and intuitive sorting algorithm that works as follows:
   a. Find the minimum element in the unsorted portion of the array.
   b. Swap it with the first element of the unsorted portion.
   c. Move the boundary of the sorted and unsorted portions one element to the right.
   d. Repeat steps 1-3 until the array is sorted.

   pseudo-code:
   function sortArr(arr)
     n = length of arr
     for i from 0 to n-2 do
        minIndex = i
        for j from i+1 to n-1 do
            if arr[j] < arr[minIndex] then
               minIndex = j
        swap arr[minIndex] with arr[I]
--------------------------------------------------------------------------------------
