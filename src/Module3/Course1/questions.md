## Assignment 1

Skill Description:

The assignment focuses on honing your skills in Java Exception Handling through practical coding
exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
addressing IOException during file operations.

Problem Statement 1:

You are provided with a program skeleton that performs a division operation. However, there is a
possibility of encountering a DivideByZeroException. Your task is to complete the program by adding
the necessary exception-handling code to catch and handle this exception gracefully.

Coding:

```public class DivideByZeroExample {
public static void main(String[] args) {
int numerator = 10;
int denominator = 0;
// TODO: Implement exception handling for divide by zero
int result = divideNumbers(numerator, denominator);
System.out.println("Result: " + result);
}
private static int divideNumbers(int numerator, int denominator) {
// TODO: Implement exception handling for divide by zero
return numerator / denominator;
}
}
```

Learning Outcomes:

- Identify and handle DivideByZeroException.
- Implement robust exception handling for arithmetic operations.

This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
IOException. Through practical coding exercises, students will enhance their skills in identifying,
handling, and customizing exceptions for various situations.


## Assignment 2
Skill Description:

The assignment focuses on honing your skills in Java Exception Handling through practical coding
exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
addressing IOException during file operations.

Problem Statement 2: 

Array Index Out of Bounds Exception
You are given a program skeleton that involves an array and a method accessing an element. Your
task is to complete the program by adding the necessary exception-handling code to catch and
handle the ArrayIndexOutOfBoundsException that may occur if an invalid index is accessed.

Coding:
```
public class ArrayIndexExample {
public static void main(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};
try {
int result = accessArrayElement(numbers, 10);
System.out.println("Result: " + result);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
}
}
private static int accessArrayElement(int[] array, int index) {
if (index < 0 || index >= array.length) {
throw new ArrayIndexOutOfBoundsException("Invalid array index");
}
return array[index];
}
}
```
Learning Outcomes:
- Recognize and handle ArrayIndexOutOfBoundsException.
- Develop skills in managing array indices.

This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
IOException. Through practical coding exercises, students will enhance their skills in identifying,
handling, and customizing exceptions for various situations.

## Assignment 3

Skill Description:

The assignment focuses on honing your skills in Java Exception Handling through practical coding
exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
addressing IOException during file operations.

Problem Statement 3: Custom Exception

You are provided with a program skeleton that involves a custom exception class. Your task is to
complete the program by adding the necessary exception handling code to catch and handle the
CustomException that may be thrown based on a specific condition.

```
class CustomException extends Exception {
// Add any additional customizations if needed
}
public class CustomExceptionExample {
public static void main(String[] args) {
int userInput = -5;
try {
validateInput(userInput);
} catch (CustomException e) {
System.out.println("Custom Exception caught: " + e.getMessage());
}
}
private static void validateInput(int input) throws CustomException {
if (input < 0) {
throw new CustomException("Input cannot be negative");
}
}
}
```
Learning Outcomes:
- Implement and handle a custom exception in Java.
- Understand the use of custom exceptions for specific conditions.

This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
IOException. Through practical coding exercises, students will enhance their skills in identifying,
handling, and customizing exceptions for various situations.

## Assignment 4

Skill Description:

The assignment focuses on honing your skills in Java Exception Handling through practical coding
exercises. You will encounter real-world scenarios such as handling DivideByZeroException, managing
ArrayIndexOutOfBoundsException, implementing custom exceptions (CustomException), and
addressing IOException during file operations.

Problem Statement 4: File Handling Exception

You are given a program skeleton that reads from a file using traditional file I/O. Your task is to
complete the program by adding the necessary exception handling code to catch and handle the
IOException that may occur during file operations.
Coding:
```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileHandlingExample {
public static void main(String[] args) {
String fileName = "sample.txt";
try {
readFromFile(fileName);
} catch (IOException e) {
System.out.println("IOException caught: " + e.getMessage());
}
}
private static void readFromFile(String fileName) throws IOException {
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
}
}
}
```
Learning Outcomes:
- Recognize and handle IOException in file operations.
- Implement effective exception handling for file I/O.

This assignment offers a comprehensive exploration of Java Exception Handling, covering scenarios
such as DivideByZeroException, ArrayIndexOutOfBoundsException, CustomException, and
IOException. Through practical coding exercises, students will enhance their skills in identifying,
handling, and customizing exceptions for various situations.