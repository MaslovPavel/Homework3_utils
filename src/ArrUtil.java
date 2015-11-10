import java.util.Random;

public class ArrUtil {

    public static int[] changeLength (int[] arr, int newLength){
        int[] newArr = new int[newLength];
        if (newLength !=0){
            for (int i = 0; i < newLength && i < arr.length; i++){
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static boolean compare(int[] arr1, int[] arr2){
        int[] tempArr1 = arr1;
        int[] tempArr2 = arr2;
        if ((tempArr1.length == 0 && tempArr2.length !=0) || (tempArr2.length == 0 && tempArr1.length !=0)){
            return false;
        }
        if (tempArr1.length + tempArr2.length ==0){
            return true;
        }


        for (int i = 0; i < tempArr1.length; i++) {
            for (int j = 0; j < tempArr1.length - i - 1; j++) {
                if (tempArr1[j] > tempArr1[j + 1]) {
                    int t = tempArr1[j];
                    tempArr1[j] = tempArr1[j + 1];
                    tempArr1[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < tempArr2.length; i++) {
            for (int j = 0; j < tempArr2.length - i - 1; j++) {
                if (tempArr2[j] > tempArr2[j + 1]) {
                    int t = tempArr2[j];
                    tempArr2[j] = tempArr2[j + 1];
                    tempArr2[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < tempArr1.length && i < tempArr2.length; i++){
            if (tempArr1[i] != tempArr2[i]){
                return false;
            }
        }
        return true;
    }


    public static void shuffle(int[] arr){
        if (arr.length != 0){
            Random rnd = new Random();
            for(int i = 0; i < arr.length; i++){
                int j = rnd.nextInt(arr.length);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void printArr(int[] arr){
        System.out.print("| ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d | ", arr[i]);
        }
    }
}
