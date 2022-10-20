import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> words = new ArrayList<>(List.of( "abc","bc", "abc","vb","yt","we"));
    public static void main(String[] args) {
       // task1();
       //task2();
        //task3();
        task4();

    }
    public static void task1() {
        for (int i = 0; i < nums.size(); i++) {
            Integer x = nums.get(i);
            if (x % 2 != 0)

                System.out.println(nums.get(i));
    }

        }
        public static void task2() {

            int prevNum = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num % 2 == 0 && num != prevNum) {
                    System.out.println(num);
                    prevNum = num;
                }
            }



        }
        public static void task3() {
            Set<String> uniqueWords = new HashSet<>(words);
            System.out.println(uniqueWords);

        }
        public static void task4() {
            Set<String> uniqueWords = new HashSet<>(words);
            System.out.println(words.size() - uniqueWords.size());

        }

}


