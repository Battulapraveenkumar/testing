import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class arithmetic_test {
    @Test
    public void addTwoPositiveNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(2,3);
        int expected_result=5;
        int actual_result=obj.sum();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void addTwoNegativeNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-3,-5);
        int expected_result=-8;
        int actual_result=obj.sum();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void addOne_postive_andOneNegativeNumber()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-3,5);
        int expected_result=2;
        int actual_result=obj.sum();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void addOneZeroandOnePositiveNumber()
    {
        Arithmeticoperations obj=new Arithmeticoperations(0,7);
        int expected_result=7;
        int actual_result=obj.sum();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractTwoPositiveNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(2,3);
        int expected_result=-1;
        int actual_result=obj.sub();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractTwoNegativeNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-3,-5);
        int expected_result=2;
        int actual_result=obj.sub();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractOnePostiveandOneNegativeNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-3,5);
        int expected_result=-8;
        int actual_result=aobj.sub();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractOneZeroandOnePositiveNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(0,7);
        int expected_result=-7;
        int actual_result=aobj.sub();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractOnePositiveandOneZeroNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,0);
        int expected_result=10;
        int actual_result=aobj.sub();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void multiplyOnePositiveandOneZeroNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,0);
        int expected_result=0;
        int actual_result=aobj.multiply();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void subtractOnePositiveandOneNegativeNumber()
    {
        Arithmeticoperations obj=new Arithmeticoperations(10,-2);
        int expected_result=-20;
        int actual_result=obj.multiply();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void multiplyTwoPositiveNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(10,9);
        int expected_result=90;
        int actual_result=obj.multiply();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void multiplyTwoNegativeNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-10,-4);
        int expected_result=40;
        int actual_result=obj.multiply();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void DivisionOnePositiveandOneNegativeNumber()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-8,3);
        int expected_result=-2;
        int actual_result=obj.division();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void DivisionTwoPositiveNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(9,2);
        int expected_result=1;
        int actual_result=obj.division();
        assertEquals(expected_result,actual_result);
    }
    @Test
    public void DivisionOnePositiveNumberandOneZero()
    {
        Arithmeticoperations obj=new Arithmeticoperations(9,0);
        Exception exception=assertThrows(ArithmeticException.class,()->obj.division());
        assertEquals(exception.getMessage(),"/ by zero");
    }
    @Test
    public void DivisionTwonegativeNumbers()
    {
        Arithmeticoperations obj=new Arithmeticoperations(-9,-4);
        int expected_result=-1;
        int actual_result=obj.division();
        assertEquals(expected_result,actual_result);
    }

}
