package calc;

/**
 *
 * @author maxwell
 */
public class Calc
{

    public long calculate(long num1, long num2, String operator)
    {
        
        switch (operator)
        { 
            
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 > num1)
                {
                    return 0;
                }
                return num1 / num2;
                
        }
            
        System.out.println("Unknown operator - " + operator);
        return 0;
        
    }
    
}
