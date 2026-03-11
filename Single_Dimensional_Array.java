
public class Single_Dimensional_Array {

    public static void main(String[] args) {
        int nums[] = {10, 80, 69, 36};

        int nums2[] = new int[7];

        System.out.println("Array with static value : ");
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.println("Array with Random value : ");
        for (int i = 0; i < 7; i++) {
            nums2[i] = (int) (Math.random() * 10);
            System.out.print(nums2[i] + " ");
        }
    }
}
