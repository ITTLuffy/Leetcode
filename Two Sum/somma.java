public class somma {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; // array contenente gli indici della soluzione
        for (int i = 0; i < nums.length; i++) { // loop per il primo numero
            for (int j = i + 1; j < nums.length; j++) { // loop per il secondo numero
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // ritorno i due indici trovati
                }
            }
        }
        return result; // default return
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}