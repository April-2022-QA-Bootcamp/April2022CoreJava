package lec02_java_basics;

/*
 * 
1) What is Java Indentation? 
-- A new Java programmer must master the concept of "indentation" in Java. Indentation is used to make our code readable to other users, easier to edit, display how the braces match up and show the logic of the program in an organized fashion. 
How to solve indentation issue:
	i) for multiple lines
	Control/Command + a
	Shift + Control/Command + f
   	
	ii) for a single line if white space is absent
	Control/Command + i
--- To learn more (Tofael: excellent link, I have to read): https://exlskills.com/learn-en/courses/java-syntax-syntax_java/java-syntax-and-style-cbxXzGDlHHww/basic-syntax-nrpnFKedXDJt/indentation-uRCvIrzfNzxN

2) How to use “toggle breadcrumb”? 
-- find the symbol (small c) and click it from header

3) How to format disorganized code? (same as no 2)
-- Command/Control + a to select, then Command/Control + i, but it can’t remove the white spaces. so, white space absent, you can use the above commands.
-- It also removes white spaces. First Command/Control + a to select all, then  Shift+ Command/Control + f.

4) How to delete a specific line? and restore?
-- Put cursor on specific line, then Command/Control + D, 
-- To restore: Command/Control + z 
-- Other keyboard Command: 
	Command/Control + x [cut], 
	Command/Control + c [copy], 
	Command/Control + v [paste], 
	Command/Control + y [previous], (not used generally)
	Command/Control + i [to organize a specific line, but it can't remove white space].
	Command/Control + r [Refresh]
	Command/Control + s [Save]

5) How to close the classes already opened? What kind of options are present?
-- Right click one of the classes and choose from close all, close others, close to left, close to right, detach etc.

6) What is it called if there is an extra space present between two words in package, Class, variables, methods, Constructor, interfaces etc? **
-- White space

7) What is the best practice when you are done with the coding for the day or take a break?
-- Always at the end of coding, format code and click ‘save all’.
-- to format a class -- Control/Command + a, then Shift + Control/Command + f (best practice)
-- to save a single class -- control/command+s 
-- to save all classes -- shift + control/command+s (best practice)

8) How can you recognize a String? 
-- when you see some sentences/words, digits etc inside double quotation.

9) How can you recognize a Class from the Java library or you created one? 
-- When it starts with UpperCase. example: System.out.println(). Here System is a class. Class can call a method or properties by period (.)

10) What is String concatenation? ****
-- Concat is a verb. String concatenation means Concat/connect multiple String.

11) What is a class body?
-- The body inside a class. More specifically, between 2 curly braces of a class. 

12) What does a class body contain? *****
-- A Class body can contain variables, Constructors, methods etc. variables can be declared or initialized. Constructor can be declared or initialized and Methods can be implemented or initialized

13) Use of \n (new line) , \r (carriage return), \t (tab), \b (backspace)
-- https://www.tutorialspoint.com/escape-sequences-in-java
-- https://www.baeldung.com/java-string-newline#:~:text=In%20Windows%2C%20a%20new%20line,the%20end%20of%20our%20string.

14) What is a carriage return in Java? (not important, no quiz)
-- In Windows, a new line is denoted using “\r\n”, sometimes called a Carriage Return and Line Feed, or CRLF. Adding a new line in Java is as simple as including “\n” , “\r”, or “\r\n” at the end of our string.
-- // https://www.codespeedy.com/how-does-a-carriage-return-r-works-in-java/


*/

public class H_info_java_basics {

	public static void main(String[] args) {
		System.out.println("Info of Java Basics described here");
	}

}
