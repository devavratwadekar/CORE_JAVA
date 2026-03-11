
public class Three_Dimensional_Array_Example {

    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k = 0; k < nums[i][j].length; k++) {
                    nums[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        for (int n[][] : nums) {
            for (int m[] : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.print("    ");
            }
            System.out.println();
        }
        // Output :
        // 7 3 7 8 5     4 9 6 0 5     0 2 1 8 6     3 0 4 8 7     
        // 4 2 7 4 8     1 4 7 8 2     9 3 9 2 3     0 5 4 8 7     
        // 4 1 1 9 2     0 5 5 1 9     7 9 9 0 4     0 6 5 3 2 
    }
}
