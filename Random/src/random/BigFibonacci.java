package random;
import java.math.BigInteger;

public class BigFibonacci {
    public static BigInteger fibonacci(int n){
        BigInteger a1 = BigInteger.valueOf(0);
        BigInteger a2 = BigInteger.valueOf(1);
        BigInteger a3 = BigInteger.valueOf(1);
        for (int i=2 ; i<=n ; i++){
            a3 =  a1.add(a2);
            a1 = a2;
            a2 = a3;
        }
        return (a2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(70));
    }    
}
