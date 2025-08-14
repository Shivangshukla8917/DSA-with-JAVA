public class linear_search {
    public static int linearsearch( int numbers[], int key){
        for (int i=0;i<=numbers.length;i++){
            if(numbers[i] == 15) {
                return i;
            }
        }
        return -1;
    } 



    public static void main(String[] args) {
        int numbers[] = {12,13,14,15,16,17,18,19};
        int key =15;
        int index =linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        }else {
            System.out.println("founded at index:"+ index);
        }
        
    }
}
