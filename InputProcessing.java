import java.math.BigInteger;
import java.lang.String;

final public class InputProcessing
{
    //Метод возведения в степень большого числа
    private static BigInteger bigIntegerPow(long a, long b)
    {
        if (b < 0)
            throw new IllegalArgumentException("Power must be equal or bigger then zero");
        else if (b == 0)
            return BigInteger.valueOf(1);
        else
        {
            BigInteger result = BigInteger.valueOf(1);

            for (int i = 0; i < b; i++)
                result = result.multiply(BigInteger.valueOf(a));
            return result;
        }
    }

    /*
    *Метод преобразования входной строки 
    *в аргумент формулы Таппера или иными словами константы K
    */
    public static BigInteger inputToTupperNumber(String input)
    {
        BigInteger number = BigInteger.valueOf(0);
        char binArray[] = input.toCharArray();

        for (int i = binArray.length - 1, j = 0; i > -1; i--, j++)
            if (binArray[i] == '1')
                number = number.add(bigIntegerPow(2, j));

        number = number.multiply(BigInteger.valueOf(17));
        return number;
    }
}