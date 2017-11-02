package math;

public class FermatsLastTheory {
   // There are no positive integers x, y and z such that
   // xn C yn D zn
//for some integer n > 2

    public static void main(String[] args) {
        fermatLastTheory();
    }

    public static void fermatLastTheory(){
        first:for (int i = 1; i < 5000000; i++) {
            for (int j = 1; j < 5000000; j++) {
                for (int k = 1; k < 5000000 ; k++) {
                    for (int l = 3; l < 5000000; l++) {
                        System.out.println( i+" - " + j +"- " + k +" = "+ "pow of "+l);
                        if (Math.pow(i,l) + Math.pow(j,l) == Math.pow(k,l)) {
                            System.out.println("Solution:");
                            System.out.println(i + " - " + j + "- " + k + " = " + "pow of " + l);
                            break first;
                        }
                    }
                }
            }
        }
    }
}
