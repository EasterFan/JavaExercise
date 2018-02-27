package array;

/**
 * 二维数组累加和
 */
public class TwoArray {
    public static void main(String[] args) {
//        int arr[][] = new int[3][4];
//        int arr[][] = new int[3][];
        int[][] arr = {{3,8,2},{2,7},{9,0,1,6}};
        int sum = getTwoArraySum(arr);
        System.out.println(sum);

    }

    static int getTwoArraySum(int arr[][]){
        int sum = 0;
        for(int x = 0;x<arr.length;x++){
            for(int y=0;y<arr[x].length;y++){
                sum+=arr[x][y];
            }
        }

        return sum;
    }
}
