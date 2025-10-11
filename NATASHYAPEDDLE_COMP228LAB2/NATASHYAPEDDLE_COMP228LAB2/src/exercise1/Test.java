package exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        questions();



    }

    //five questions about three lectures of this course
    public static void questions() {

        //QUESTION1 answer array
        String[] optionsQ1 = {"Java Standard Edition 8 (Java SE 8)", "Java Enterprise Edition (Java EE)", "Java Micro Edition (Java ME)", "Java Enterprise Edition 2 (Java 2 EE)"};
        //datatype [] array symbol array name = [array elements];

        //QUESTION 2 answer array - 3rd correct
        String[] optionsQ2 = {"The value of th instance variables are not shared among objects of the same class", "Every instance variable has a default initial value - a value provided by Java when you do not specify the instance variable’s initial value",
        "Instance variables are not automatically initialized", "The default value for an instance variable of type String is null"};

        //QUESTION 3 answer array - 2nd correct
        String[] optionsQ3 = {"16","15","5","8"};

        //QUESTION 4 answer array 4th correct
        String[] optionsQ4 = {"Abstract class","Subscriber class", "Concrete class", "Driver class"};

        //QUESTION 5 answer array 1st correct
        String[] optionsQ5 = {"Package", "Method", "IDE", "Function"};

        //QUESTION 1 SHOW QUESTION+ARRAY OPTIONS
        int question1 = JOptionPane.showOptionDialog(
                null,
                " Question: Which of the following editions of Java  contains the capabilities needed to develop desktop and server applications?", "Question 1",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsQ1, optionsQ1[0]
        );
        //checks answer
        boolean q1Correct = checkAnswer(question1);
        String responseMessageQ1 = userMessageQ1(q1Correct);
        //panel
        JOptionPane.showMessageDialog(null, responseMessageQ1);

        //QUESTION 2 SHOW QUESTION+ARRAY OPTIONS
        int question2 = JOptionPane.showOptionDialog(null, "Which of the following statement is false about Java instance variables?", "Question 2",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsQ2, optionsQ2[0]
                );

        boolean q2Correct = checkAnswerQ2(question2);
        String responseMessageQ2 = userMessageQ2(q2Correct);
        JOptionPane.showMessageDialog(null, responseMessageQ2);

        //QUESTION 3 SHOW QUESTION+ARRAY OPTIONS
        int question3 = JOptionPane.showOptionDialog(null, "How many significant digits does a double precision number have?","Question 3",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsQ3, optionsQ3[0]
                );

        boolean q3Correct = checkAnswerQ3(question3);
        String responseMessageQ3 = userMessageQ3(q3Correct);
        JOptionPane.showMessageDialog(null, responseMessageQ3);

        //QUESTION 4 SHOW QUESTION+ARRAY OPTIONS
        int question4 = JOptionPane.showOptionDialog(null, "Which one of the following terms is correct for a Java class that creates object  of another class, then calls the object’s methods?", "Question 5",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsQ4, optionsQ4[0]
                );

        boolean q4Correct = checkAnswerQ4(question4);
        String responseMessageQ4 = userMessageQ4(q4Correct);
        JOptionPane.showMessageDialog(null, responseMessageQ4);

        //QUESTION 5 SHOW QUESTION+ARRAY OPTIONS
        int question5 = JOptionPane.showOptionDialog(null,"Which of the following typically groups related classes so that they could be imported into programs and reused?", "Question 5",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsQ5, optionsQ5[0]
                );
        boolean q5Correct = checkAnswerQ5(question5);
        //shows response
        String responseMessageQ5 = userMessageQ5(q5Correct);
        JOptionPane.showMessageDialog(null, responseMessageQ5);

    }

    //CHECKS IF QUESTION INPUT IS CORRECT
    public static boolean checkAnswer(int question1) {
    return question1 ==0;
    }

    public static boolean checkAnswerQ2(int question2) {
        return question2 ==2;
    }
    public static boolean checkAnswerQ3(int question3) {
        return question3 ==1;
    }
    public static boolean checkAnswerQ4(int question4) {
        return question4 ==3;
    }
    public static boolean checkAnswerQ5(int question5) {
        return question5 ==0;
    }


    // RETURNS A MESSAGE IF CORRECT OR INCORRECT
    public static String userMessageQ1(boolean q1Correct) {

        Random randomObject = new Random();

        if (q1Correct) {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";


            }
        } else {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Try Again!";
                case 1: return "Nice Try!";
                case 2: return "Incorrect!";
                case 3: return "Don't Give up!";

            }
        }

        return "Broken";

    }

    public static String userMessageQ2(boolean q2Correct) {

        Random randomObject = new Random();

        if (q2Correct) {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";


            }
        } else {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Try Again!";
                case 1: return "Nice Try!";
                case 2: return "Incorrect!";
                case 3: return "Don't Give up!";

            }
        }

        return "Broken";

    }

    public static String userMessageQ3(boolean q3Correct) {

        Random randomObject = new Random();

        if (q3Correct) {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";


            }
        } else {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Try Again!";
                case 1: return "Nice Try!";
                case 2: return "Incorrect!";
                case 3: return "Don't Give up!";

            }
        }

        return "Broken";

    }

    public static String userMessageQ4(boolean q4Correct) {

        Random randomObject = new Random();

        if (q4Correct) {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";


            }
        } else {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Try Again!";
                case 1: return "Nice Try!";
                case 2: return "Incorrect!";
                case 3: return "Don't Give up!";

            }
        }

        return "Broken";

    }

    public static String userMessageQ5(boolean q5Correct) {

        Random randomObject = new Random();

        if (q5Correct) {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";


            }
        } else {
            switch ( randomObject.nextInt( 4 ) ){
                case 0: return "Try Again!";
                case 1: return "Nice Try!";
                case 2: return "Incorrect!";
                case 3: return "Don't Give up!";

            }
        }

        return "Broken";

    }



    //ADD SCORING SYSTEM
    }//TEST END BRACKET - DO NOT MOVE
