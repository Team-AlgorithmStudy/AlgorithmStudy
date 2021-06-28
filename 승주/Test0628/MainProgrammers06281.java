package test0628;

import java.util.HashSet;
import java.util.Set;

public class MainProgrammers06281 {
    /**
     * 프로그래머스 폰켓몬
     * @param args
     */
    public static void main(String[] args) {
        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        int result = solution(nums3);

        System.out.println(result);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int num :
                nums) {
            set.add(num);
        }
        answer = nums.length/2 >= set.size() ? set.size() : nums.length/2;

        return answer;
    }
}
