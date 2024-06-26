<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sorting</title>
</head>
<body>

<h1>Sorting</h1>
<p>Implementation of vital sorting techniques in Java</p>

<h2>Sorting Algorithms Covered</h2>
<hr>

<ol>
   <li>
      <h3>Selection Sort:</h3>
      <p>Selection sort is a simple and intuitive sorting algorithm that works as follows:</p>
      <ol type="a">
         <li>Find the minimum element in the unsorted portion of the array.</li>
         <li>Swap it with the first element of the unsorted portion.</li>
         <li>Move the boundary of the sorted and unsorted portions one element to the right.</li>
         <li>Repeat steps 1-3 until the array is sorted.</li>
      </ol>

      <h4>Pseudocode:</h4>
      <pre>
function sortArr(arr)
   n = length of arr
   for i from 0 to n-2 do
      minIndex = i
      for j from i+1 to n-1 do
         if arr[j] &lt; arr[minIndex] then
            minIndex = j
      swap arr[minIndex] with arr[i]
      </pre>
   </li>
</ol>

<hr>

</body>
</html>
