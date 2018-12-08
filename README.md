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