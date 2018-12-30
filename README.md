# Java Algorithms

Repository for storing practice algorithms. 


### Caesar.java

The Caesar Cipher takes in a String and an Integer key and produces a String that is shifted a certain number down the alphabet. 

```
System.out.println(caesarMethod("Hello World!", 3));
```
results in 
```
Khoor Zruog!
```

### SymmetricDifference.java

The symmetric difference algorithm takes in two arrays and returns an array containing only the difference. 
```
Integer[] firstArray = {2, 2, 3, 4, 5};
Integer[] secondArray = {2, 4, 6, 8, 10};
SymmetricDifference.getSymmetricDifference(firstArray, secondArray);
```
results in 
```
[3, 5, 6, 8, 10]
```


### RotateArray.java

The rotate array algorithm rotates an array to the right by a given key. 
```
Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};            
int key = 3;                                                     
System.out.println(Arrays.toString(rotateArray(intArray, key))); 
```
results in 
```
[8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
```
### ReverseWordsInAString.java

Algorithm to reverse the words in a string.
```
String input = "Hello to the entire world!";
System.out.println(reverser(input));
```
results in 
```
world! entire the to Hello 
```
### BinarySearch.java

Algorithm using a recursive function to efficiently search through an ordered array.
```
int IntToSearchFor = 33;
binarySearch(myArray, IntToSearchFor, myArray.length - 1, 0);
```
results in 
```
The index of the missing number is: 33
```
### RepeatingNumbers.java

Utilizes a HashMap to return the only number in an Array that repeats an odd number of times. 
```
int[] myArray = {1, 2, 6, 2, 1};
System.out.println(repeatingNumber(myArray));
```
results in 
```
6
```
### MultithreadingSearch.java

Utilizes multiple threads to quickly search an array for an integer. 
```
int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int numberToFind = 10;
threadCreation(myArray, 2, false, numberToFind);
```
results in 
```
Thread 1 thread can't find your missing number!
Found = false
Thread 2 thread found the number: 10
Found = true
```