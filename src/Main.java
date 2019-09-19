import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {


        int count = 0;
        String num = "" ;
        float total= 0,numAsF;


        num = JOptionPane.showInputDialog(null,"Please enter a number: " ,"Numbers" ,JOptionPane.INFORMATION_MESSAGE);


        while (!num.equals("q") ){


            numAsF = Float.parseFloat(num);
            total += numAsF;

            num = JOptionPane.showInputDialog(null,"Please enter a number: " ,"Numbers" ,JOptionPane.INFORMATION_MESSAGE);

            count ++;

        }


        JOptionPane.showMessageDialog(null,"You have quit the loop!!! The amount of numbers you entered is " + count +" and if you added them all up they add up too " + total ,"Info" ,JOptionPane.INFORMATION_MESSAGE);
    }
}
