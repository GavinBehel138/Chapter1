public class RandomGuess
{
    public static void main(String [] args)
    {

        JOptionPane.showMessageDialog(parentComponent: null, message: "The number is " +
            ((int) (Math.random() * 10)));
    }
}
