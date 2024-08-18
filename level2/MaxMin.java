package level2;

import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {

        Solution s = new Solution();
        s.solution("-1 -2 -3 -4");
    }
}


class Solution {
    public String solution(String s) {
        String answer = "";

        String[] numStrings = s.split("\\s+");  // 공백 기준으로 자르고 numStrings에 넣음
        int[] num = new int[numStrings.length];  // String을 int로 바꾸기 위해 만듬

        for (int i = 0; i < numStrings.length; i++) {  // String을 int로 바꾸기 위해 만듬
            num[i] = Integer.parseInt(numStrings[i]);
        }

        Arrays.sort(num);  // 정렬하여 순서대로 배치

        answer = num[0] + " " + num[num.length-1];  // 가장 작은 숫자가 0번째 큰 숫자가 마지막 숫자이기 때문에, "" 공백 추가

        return answer;
    }
}