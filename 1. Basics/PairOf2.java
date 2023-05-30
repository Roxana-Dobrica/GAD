public class PairOf2 {

    public static void sortArray(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - i -1; j++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int findPairOf2(int[] arr){
        int count = 0;
        sortArray(arr);
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j<arr.length - 1; j++){
                if(arr[i] + arr[j] == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, -3, -2, 3, 0};
        System.out.println(findPairOf2(arr));
    }
}
