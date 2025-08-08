import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age is:");
        int age = sc.nextInt();
        if (age>= 18) {
            System.out.println("adult");
        }
        if (age >13 && age<17) {
            System.out.println("teenager");
        }
        else {
            System.out.println("not adult");
        }
    }
    
}
