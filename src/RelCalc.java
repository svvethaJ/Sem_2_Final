public class RelCalc extends Calculator
{
    public RelCalc(double num1, double num2)
    {
        super(num1, num2);
    }

    //part of calc that checks for relation between numbers
    public boolean isEqual()
    {
        return num1 == num2;
    }

    public boolean isBigger()
    {
        return num1 > num2;
    }

    public boolean isSmaller()
    {
        return num1 < num2;
    }

    public boolean largeOrEqual()
    {
        return num1 >= num2;
    }

    public boolean smallOrEqual()
    {
        return num1 <= num2;
    }

    public boolean notEquiv()
    {
        return num1 != num2;
    }
}
