
public class isPrime {
    public static boolean isPrimeor(int n) {
        boolean isPrimeor = true;
        for (int i =2; i <=n-1;i++) {
            if (n%i ==0) {
                isPrimeor = false;
                break;
            }
        }
        return isPrimeor;
        
    }



    public static void main(String[] args) {
        System.out.println(isPrimeor(11));
        
    }
    
}
