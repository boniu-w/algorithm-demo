package algorithm.algorithmdemo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wg
 * @Package algorithm.algorithmdemo
 * @date 2020/3/13 14:02
 * @Copyright
 */
public class Sort {

    // 找出数组中最小值所在的索引
    public int chaseSmallest(Integer[] arr) {

        int smallest = arr[0];
        int smallest_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallest_index = i;
            }
        }

        return smallest_index;
    }

    // 用 steam 方法找最小值
    public void locateSmallest(int[] arr){
        int anInt = Arrays.stream(arr).min().getAsInt();
        System.out.println("最小值为 : "+anInt);
    }


    // 删除数组中的指定元素,返回一个新数组
    public Integer[] deleteIndex(int index, Integer[] arr) {
        Integer[] a = new Integer[arr.length - 1];
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            integers.add(arr[i]);
        }

        integers.remove(index);
        a = integers.toArray(a);

        return a;
    }


    @Test
    public void test1() {
        Integer[] arr = {3, 2, 5};
        int smallest_index = chaseSmallest(arr);

        System.out.println(smallest_index);

        Integer[] integers = deleteIndex(smallest_index, arr);
        System.out.println(Arrays.toString(integers));

        int[] a={2,5,9};
        locateSmallest(a);
    }
}
