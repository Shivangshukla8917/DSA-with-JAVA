public class largestnum_inarray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {12,13,14,115,16,17,18,1200};
        System.out.println("largest numbers :" + getLargest(numbers));

        
    }
    
}
