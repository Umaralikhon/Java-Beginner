package Platform;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class CalculatorTest{
    private double result;
    Calculator calc = new Calculator(6, 3);

    @Test
    public void sumTest(){
        result = calc.sum();
        Assert.assertEquals(9.0, result);
    }

    @Test
    public void multiplicationTest(){
        result = calc.multiplication();
        Assert.assertEquals(18.0, result);
    }

    @Test
    public void subtractionTest(){
        result = calc.subtraction();
        Assert.assertEquals(3.0, result);
    }

    @Test
    public void division(){
        result = calc.division();
        Assert.assertEquals(2.0, result);
    }
}
