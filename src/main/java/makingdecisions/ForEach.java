import java.util.List;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer num : nums) {
            System.out.println(num);

            if (num > 2) break;
        }
    }
}
