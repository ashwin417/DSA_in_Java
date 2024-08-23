
---

## 1. Overview
To run the "ByteCraft Pro" application from the command line, you need to be familiar with using the Java Development Kit (JDK), specifically the `java` and `javac` commands. This guide covers the key aspects: compiling the code, running the compiled classes, setting classpaths, specifying system properties, and passing command-line arguments.

### Prerequisites
- Ensure that the JDK is installed and added to your system’s PATH.
- The application source files should be organized correctly within packages.

## **2. Steps for Running the Application**

### **Step 1: Compile the Source Code**
The first step is to compile your `.java` files into `.class` files using the `javac` command.

```bash
javac -d out src/com/byteminds/bytecraftpro/*.java
```

- `-d out`: Specifies the output directory for the compiled classes.
- `src/com/byteminds/bytecraftpro/*.java`: The path to the source files.

This command compiles all Java files under the `src/com/byteminds/bytecraftpro/` directory and places the resulting `.class` files in the `out` directory.

### **Step 2: Set the Classpath**
When running the application, you may need to set the classpath if you have dependencies or your classes are spread across multiple directories.

```bash
java -cp out com.byteminds.bytecraftpro.MainClass
```

- `-cp out`: Specifies the classpath pointing to the compiled classes.
- `com.byteminds.bytecraftpro.MainClass`: The fully qualified name of the class containing the `main` method.

### **Step 3: Run the Application with System Properties**
You can specify system properties using the `-D` option:

```bash
java -cp out -Dapp.env=production com.byteminds.bytecraftpro.MainClass
```

- `-Dapp.env=production`: Sets a system property `app.env` with the value `production`. You can access this property in your code using `System.getProperty("app.env")`.

### **Step 4: Passing Command-Line Arguments**
You can pass arguments directly after specifying the main class:

```bash
java -cp out com.byteminds.bytecraftpro.MainClass arg1 arg2 arg3
```

- These arguments can be accessed within the `main` method using the `args` array:

  ```java
  public static void main(String[] args) {
      for (String arg : args) {
          System.out.println(arg);
      }
  }
  ```

### **Step 5: Handling External Libraries (if applicable)**
If your project uses external libraries (e.g., JAR files), include them in the classpath:

```bash
java -cp "out:lib/*" com.byteminds.bytecraftpro.MainClass
```

- `lib/*`: Includes all JAR files in the `lib` directory.

### **Step 6: Running the Application with a JAR File**
After development, you might want to package your application as a JAR file and run it:

1. **Create the JAR File:**

   ```bash
   jar cfe bytecraftpro.jar com.byteminds.bytecraftpro.MainClass -C out/ .
   ```

    - `cfe`: Creates a JAR file with the entry point specified.
    - `-C out/ .`: Includes all compiled classes from the `out` directory.

2. **Run the JAR File:**

   ```bash
   java -jar bytecraftpro.jar arg1 arg2
   ```

## **3. Conclusion**
This process ensures that you can run the "ByteCraft Pro" project from the command line efficiently. By mastering these steps, you’ll be able to handle everything from simple executions to more complex configurations involving external libraries, system properties, and command-line arguments.

---

