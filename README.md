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

