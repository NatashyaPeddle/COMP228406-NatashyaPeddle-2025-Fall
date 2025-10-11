package exercise2;
import javax.swing.*;
import java.util.Random;

public class LottoDriver {

    public static void main(String[] args) {

        int userinput = 0;
        boolean withinRange = false;
        int round;
        boolean userWin = false;

        String inputchoice = JOptionPane.showInputDialog(null,
                "enter number between 3-27:",  /// text
                "Lotto", /// title
                JOptionPane.QUESTION_MESSAGE); ///dialog type = question
        if (inputchoice ==null) /// if user does not put in input or just closes app
            return; ///returns nothing

        userinput = Integer.parseInt(inputchoice); ///string conversation to int

        if (userinput >= 3 && userinput <=27) {/// checks if user inputted number is in range
            withinRange = true;
            JOptionPane.showMessageDialog(null,
                    "Input accepted"); ///input valid

        }else{
            JOptionPane.showMessageDialog(null,
                    "Input not accepted."); ///input invalid
        }


        for (round = 1; round <= 5; round++){/// starts round loop at 1-5

            Lotto newLotto = new Lotto(); ///new instance
            int [] nums = newLotto.numGet(); ///gets array
            int sum = nums[0] + nums[1] + nums[2]; ///adds lotto nums to sum
            JOptionPane.showMessageDialog(null, "Roll:" + round + "\nNumbers:" + newLotto + "\nSum:" + sum);

            if (sum == userinput) {
                JOptionPane.showMessageDialog(null, "You win");
                userWin = true;
            } else {
                JOptionPane.showMessageDialog(null,"No match, try again");
            }


        }
        if (!userWin) {
            JOptionPane.showMessageDialog(null, "You lose! 0/5");
        }

        JOptionPane.showMessageDialog(null, "Game Finished.");
    }///MAIN CLASS END BRACKET - DO NOT TOUCH

}///LOTTO DRIVER END BRACKET - DO NOT TOUCH