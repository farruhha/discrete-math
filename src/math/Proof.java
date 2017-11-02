package math;

public class Proof {

    public static void main(String[] args) {
        proof();
    }

    public static void proof(){
        for (int i = 0; i <99999999 ; i++) {
            double sum = Math.pow(i,2)+ i + 41;
            if(!isPrime(sum)){
                System.out.println("Found = " +i);
            }
        }
    }

    static boolean isPrime(double number){
        for (int i = 2; i < number ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
