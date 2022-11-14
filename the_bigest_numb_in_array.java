public class the_bigest_numb_in_array {
    public static void main(String[] args){
        int[] temp = {13,12,15,11,9,12,16};
        for(int i = 0; i < temp.length; i++){
            for(int j = i + 1; j < temp.length; j++){
                if(temp[j] > temp[i]){
                    int l = j - i;
                    System.out.println("The warmest day in " + l + " day/s");
                    System.out.println("Now are " + temp[i] + " degrees");
                    break;
                }
            }
        }
    }
}
