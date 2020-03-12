package algorithm.algorithmdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;

@SpringBootTest
class AlgorithmDemoApplicationTests {

    @Test
    void contextLoads() {
        int[] array = {1, 3, 10, 13, 25};

        int i = test1(array, 10);
        System.out.println(i);
    }

    // 二分查找法
    public int test1(int[] arr, int item) {
        Arrays.sort(arr);

        int firstIndex = 0;
        int endIndex = arr.length - 1;

        int count = 0;

        while (firstIndex <= endIndex) {
            int mid = new BigDecimal(Math.floor((firstIndex + endIndex) / 2)).intValue();
            int guess = arr[mid];

            count++;

            if (guess == item) {
                System.out.println(count + "............");
                return guess;
            } else if (guess < item) {
                firstIndex = mid + 1;

            } else if (guess > item) {
                endIndex = mid - 1;

            }
        }

        return 0;
    }

}
