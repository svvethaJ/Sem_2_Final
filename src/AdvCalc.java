public class AdvCalc extends Calculator
{
    public AdvCalc(double num1, double num2)
    {
        super(num1, num2);
    }
    public double mult()
    {
        return num1 * num2;
    }

    public double divvy()
    {
        if (num2 != 0)
        {
            return num1 / num2;
        }
        else
        {
            System.out.println("You may not divide by zero.");
            return Double.NaN;
        }
    }
}