
import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberMethodTest {


    @Test
    public void primeNumberTestPositive() {
        Assert.assertTrue(PrimeNumberMethod.isPrime(2));
        Assert.assertTrue(PrimeNumberMethod.isPrime(3));
        Assert.assertTrue(PrimeNumberMethod.isPrime(5));
        Assert.assertTrue(PrimeNumberMethod.isPrime(7));
    }

    @Test
    public void primeNumberTestNegative() {
        Assert.assertFalse(PrimeNumberMethod.isPrime(4));
        Assert.assertFalse(PrimeNumberMethod.isPrime(9));
        Assert.assertFalse(PrimeNumberMethod.isPrime(10));
        Assert.assertFalse(PrimeNumberMethod.isPrime(15));
    }

}
