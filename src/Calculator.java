public class Calculator
{
    public double num1, num2;

    public Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    //getters
    public double getNum1()
    {
        return num1;
    }
    public double getNum2()
    {
        return num2;
    }

    public double addition()
    {
        return num1 + num2;
    }
    public double subtraction()
    {
        return num1 - num2;
    }
}
