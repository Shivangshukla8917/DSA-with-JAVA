

public class characterpattern {
    public static void main(String[] args) {
        int n=5;
        char word= 'A';
        for(int line =1;line<=n;line++) {
            for (int num=1; num<=line;num++) {
                System.out.print(word);
                word++;
            }
            System.out.println();

        }
    }
    
}
