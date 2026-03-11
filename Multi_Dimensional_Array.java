
public class Multi_Dimensional_Array {

    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                nums[i][j] = (int) (Math.random() * 100);   //print random two digit number
                if (nums[i][j] >= 10) {     // check random number is greater than 10
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(10 + " ");   // set 10 if number is not greater than 10 
                }
            }
            System.err.println();
        }
        System.err.println();

        // for (int n[] : nums) {
        //     for (int m : n) {
        //         System.err.print(m + " ");
        //     }
        //     System.err.println();
        // }
    }
}
