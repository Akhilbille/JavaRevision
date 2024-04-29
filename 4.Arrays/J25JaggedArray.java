import java.util.*;

public class J25JaggedArray {
    public static void main(String[] args){
        int arr[][]= new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[2];
        Scanner input = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    
}
