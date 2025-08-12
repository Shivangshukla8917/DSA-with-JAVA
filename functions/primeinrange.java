public class primeinrange {
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




    public static void primesinrange(int n) {
        for (int i=2;i<=n;i++){
            if (isPrimeor(i)){
                System.out.println(i+ "");
            }
        }
        System.out.println();
    }




    public static void main(String[] args) {
        primesinrange(20);
        
    }
    
}
