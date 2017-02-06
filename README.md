Java Fundamentals - Homework 2
===========

This project is **Homework 2** for the [Java Fundamentals](https://courses.cs.ttu.ee/pages/ITI8905) course.

Homework assignment
-------------------
Implement the method ```getWords(filename)``` in class ```Homework2```. Do not change the method signature.

Find five most used words in a file. Treat words in case insensitive manner. Implementation must use the stream API and lambdas.

You can use the following snippet to read lines:

```Files.lines(Paths.get("lorem-ipsum.txt"))
```

Additional tips:
* Consider edge cases! 
* must work with any file, not only lorem-ipsum.txt 
* punctuation matters
* format your code!

Running the application
-----------------------

Once you have successfully built the application, a jar file is generated to `target/jf-homework2.jar`. You can now try running the application's `main` method by calling:
```shell
java -jar target/jf-homework1.jar lorem-ipsum.txt
```

Submitting your assignment
--------------------------

When you have gotten the test passing and the build to succeed, you can submit your assignment by first running the following command in the homework root folder:

```shell
./mvnw clean deploy
```

It will ask you for your **full name**, **Student Code** (also known as *matrikli number*) and a **comment** *(optional)*.

Example:

```shell
./mvnw clean deploy

#...skipping building, testing and packaging output from Maven...

[INFO] --- maven-antrun-plugin:1.7:run (package homework ZIP) ---
[INFO] Executing tasks

main:
Your full name (e.g. John Smith):
Jane Smith
Your Student Code (matrikli number, e.g. ABCD012345):
ABCD012345
Comment:
Java IO
      [zip] Building zip: /Users/lanza/Projects/java/jf/jf-hw-intro/target/jf-howework2-ABCD012345.zip
   [delete] Deleting: /Users/lanza/Projects/java/jf/jf-hw-lambda/homework.properties
[INFO] Executed tasks
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 45.028s
[INFO] Finished at: Thu Aug 28 15:36:19 EEST 2014
[INFO] Final Memory: 17M/99M
[INFO] ------------------------------------------------------------------------
```

After Maven has finished and the build was successful, you can find a **ZIP file** at **target/jf-homework2-ABCD012345.zip** *(the name of the zip file contains the homework number and your Student Code/matrikli number)*.

This ZIP file contains all the files that we need to check your homework.
The only thing left to do now is to send the ZIP file as an attachment to an e-mail with subject **"Homework 1 - *your Student Code/maktrikli number*"** to *jf@zeroturnaround.com*.


Various tips
============

If you still want to build the application without fixing the tests, then you can do that by skipping them in the build by adding -DskipTests to the command:
```shell
./mvnw clean package -DskipTests
```
However, note that this is just for experimenting - to get the full score for this assignment, you still need to make the test(s) pass correctly.

Using Eclipse
-------------

If you are an Eclipse user then you can import the project to your workspace. *File* - *Import* - *Existing Maven Projects*.

To run the project or unit tests in Eclipse you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!

Using IntelliJ IDEA
-------------------

If you are an IntelliJ IDEA user then you can import the project by selecting *File* - *New* - *Project from Existing Sources...*
and follow the dialog instructions.

To run the project or unit tests in IntelliJ IDEA you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!
