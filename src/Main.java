import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        Exercise 1:
//        Create a program that prints “It’s a great day today”.
//        Then ask the user “What is your name?. Then print “Hello [NAME]”
        System.out.println("What is your name?");
        String name = read.nextLine();
        System.out.println("Hello " + name);

//        Exercise 2:
//        Ask for the user to enter a number. Ask the user for another number.
//        Print the sum of the two numbers, then the difference of the two numbers.
//        System.out.println("Enter a number");
//        int num1 = read.nextInt();
//        System.out.println("Enter another number");
//        int num2 = read.nextInt();
//        System.out.println("The sum is " + (num1 + num2));
//        System.out.println("The difference is " + (num1 - num2));

//        Exercise 3:
//        Ask the user to enter their balance. Print “I’ve granted you $1.50 more!
//        Your new balance is: [BALANCE]”
//        System.out.println("Enter your balance");
//        int balance = read.nextInt();
//        System.out.println("I have granted to $1.50 more!");
//        System.out.println("Your new balance is: " + (balance + 1.50));

//        Exercise 4:
//        Ask a user to enter a password. Enter a password. Ask user to reenter password.
//        Check to see if they are correct.
//        System.out.println("Enter your password");
//        String pass1 = read.next();
//        System.out.println("Re-enter your password");
//        String pass2 = read.next();
//
//        if(pass1.equals(pass2)){
//            System.out.println("Match");
//        }
//        else{
//            System.out.println("No Match");
//        }

//        Exercise 5:
//        Print “CORRECT” if 1, 2, or 3 is entered. If anything else is entered print "ERROR".
//        System.out.println("Enter a number");
//        int num1 = read.nextInt();
//        if(num1 ==1 || num1 ==2 || num1 ==3 ){
//            System.out.println("CORRECT");
//        }
//        else{
//            System.out.println("ERROR");
//        }

//        Exercise 6:
//        Ask the user to enter a number. If it’s positive, print “POSITIVE”.
//        If it’s negative, print “NEGATIVE”. If it’s zero, print "ZERO".
//        System.out.println("Enter a number");
//        int num = read.nextInt();
//        if(num > 0){
//            System.out.println("Positive");
//        }
//        else if(num < 0){
//            System.out.println("Negative");
//        }
//        else{
//            System.out.println("ZERO");
//        }

//        Exercise 7:
//        Ask the user for 3 card numbers. If it equals 21 print BLACKJACK!,
//        if it’s greater than 21 print BUST!, if it’s less than 21 print “The total is [TOTAL]”
//        System.out.println("Enter three card numbers");
//        int num1 = read.nextInt();
//        int num2 = read.nextInt();
//        int num3 = read.nextInt();
//        int sum = (num1 + num2 + num3);
//        if(sum < 21){
//            System.out.println("The total is: " + sum);
//        }
//        else if (sum > 21){
//            System.out.println("BUST");
//        }
//        else{
//            System.out.println("BLACKJACK");
//        }

//        Exercise 8:
//        Ask the user to enter a number grade. It should print according to the following:
//        A 90 - 100 B 80 - 89 C 70 - 79 D 60 - 69 F 0 - 59
//        If it's negative or over 100 print "Error".
//        System.out.println("Enter a grade");
//        int grade = read.nextInt();
//        if(grade <= 100 && grade >= 90){
//            System.out.println(grade + ":A");
//        }
//        else if(grade <= 89 && grade >= 80){
//            System.out.println(grade + ":B");
//        }
//        else if(grade <= 79 && grade >= 70){
//            System.out.println(grade + ":C");
//        }
//        else if(grade <= 69 && grade >= 60){
//            System.out.println(grade + ":D");
//        }
//        else if(grade <= 59 && grade >= 0){
//            System.out.println(grade + ":F");
//        }
//        else{
//            System.out.println("ERROR");
//        }

//        Exercise 9:
//        Ask the user for their height in centimeters. Print their height in feet and inches.
//        System.out.println("Enter you height in centimeters");
//        int heightMetric = read.nextInt();
//        double heightInches = (heightMetric * 0.393701);
//        double heightFeet = (heightInches/12);
//        System.out.println("Your height in feet is: " + heightFeet);

//        Exercise 10:
//        Ask the user to enter three numbers.
//        Find the largest of three numbers using only things we learned today.
//        System.out.println("Enter three numbers");
//        int num1 = read.nextInt();
//        int num2 = read.nextInt();
//        int num3 = read.nextInt();
//        if(num1 > num2 && num1 > num3){
//            System.out.println("The largest number is: " + num1);
//        }
//        else if(num2 > num1 && num2 > num3){
//            System.out.println("The largest number is: " + num2);
//        }
//        else if(num3 > num1 && num3 > num2){
//            System.out.println("The largest number is: " + num3);
//        }

//        Exercise 11:
//        Create a program that can calculate the quadratic equation.
//        Google it if you don't know the equation.
//        x = -b +- square root b squared - 4ac all over 2a
//        System.out.println("Enter three numbers");
//        double num1 = read.nextInt();
//        double num2 = read.nextInt();
//        double num3 = read.nextInt();
//        double total1 = ((num2*-1) - (Math.sqrt((num2*num2) - (4*(num1*num3)))/(num1*2)));
//        double total2 = ((num2*-1) + (Math.sqrt((num2*num2) - (4*(num1*num3)))/(num1*2)));
//
//        System.out.println("x =  " + total1 + " and " + total2);


    }
}
