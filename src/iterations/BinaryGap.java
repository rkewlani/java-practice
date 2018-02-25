package iterations;

/**
 * Created by rajni on 2/25/18.
 */
public class BinaryGap {
    public static void main(String args[]) {
        System.out.println("longest binary gap is " + solution(561892));
    }

    public static int solution(final int n) {
        String binRep = Integer.toBinaryString(n);
        System.out.println("number in binary form is " + binRep);
        int currentZero = 0;
        int maxZero = 0;

        for (int i = 0; i < binRep.length(); i++) {
            if (binRep.charAt(i) == '0') {
                currentZero++;
            } else if (binRep.charAt(i) != '0') {
                if (currentZero > maxZero) {
                    maxZero = currentZero;

                }
                currentZero = 0;
            }
        }
        return maxZero;
    }
}
