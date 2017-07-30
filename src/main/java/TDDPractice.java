/**
 * Created by Travis Brindley on 7/27/2017.
 */
public class TDDPractice {

    public static int primeNumber(int x) {
        int primeNum=1;
        int primeCounter = 0;
        boolean addPrime;
        do{
            primeNum ++;
            addPrime=isPrime(primeNum);
            if (addPrime) {
                primeCounter ++;
            }

        }while (primeCounter < x);
        return primeNum;
    }
    public static boolean isPrime(int num){
        for(int i = 2;i < num;i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
