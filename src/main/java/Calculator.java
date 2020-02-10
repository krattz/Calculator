public class Calculator {

    public static void main(String[] args) {
     add(1,2,3,4,5);
     multiply(-1,3);
    }
    public static int add(int... nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println("addition results: " +result);
        return result;

    }

    public static int multiply(int... nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result *= nums[i];
        }
        System.out.println("multiplication results: " +result);
        return result;

    }
}