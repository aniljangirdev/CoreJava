package pack1;

public class PrimeNumberDemo {

    public static void main(String[] args) {
        int input = 16;
        boolean primeNo = isPrimeNo(input);
        System.out.println(primeNo);
    }

    private static boolean isPrimeNo(int input){
        int count = 2;
        while (count * count  < input) {
            if(input % (count * count) == 0)
                return false;
            count ++;
        }
        return true;
    }
}
