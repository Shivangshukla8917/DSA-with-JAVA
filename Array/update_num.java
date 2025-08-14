public class update_num {
    public static void update_(int marks[]) {
        for (int i=0;i<marks.length;i++) {
            marks[i] = marks[i] + 1;
        }

    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update_(marks);

        for (int i=0;i<marks.length;i++) {
            System.out.println(marks[i]+ " ");
        }
        System.out.println();
        
    }
    
}
