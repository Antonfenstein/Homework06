import org.example.Calculator;

public class App
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int additionResult = calculator.addition(11, 20);
        int substractionResult = calculator.substraction(12, 5);
        System.out.println("Addition result is " +additionResult);
        System.out.println("Substraction result is " +substractionResult);

    }
}