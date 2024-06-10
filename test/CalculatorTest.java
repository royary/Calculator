import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator c = new Calculator();
        Assert.assertEquals(201, c.add(100,101));
    }
    @Test
    public void minusTest(){
        Calculator c = new Calculator();
        Assert.assertEquals(-1, c.minus(100,101));
}
}