package level1;

public class Keypad {

}


class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] leftPos = {3, 0};  // '*'의 초기 위치
        int[] rightPos = {3, 2}; // '#'의 초기 위치

        int[][] keypad = {
                {3, 1}, // 0의 위치
                {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3의 위치
                {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6의 위치
                {2, 0}, {2, 1}, {2, 2}  // 7, 8, 9의 위치
        };

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                leftPos = keypad[num];
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rightPos = keypad[num];
            } else {
                int leftDist = Math.abs(leftPos[0] - keypad[num][0]) + Math.abs(leftPos[1] - keypad[num][1]);
                int rightDist = Math.abs(rightPos[0] - keypad[num][0]) + Math.abs(rightPos[1] - keypad[num][1]);

                if (leftDist < rightDist) {
                    answer += "L";
                    leftPos = keypad[num];
                } else if (rightDist < leftDist) {
                    answer += "R";
                    rightPos = keypad[num];
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        leftPos = keypad[num];
                    } else {
                        answer += "R";
                        rightPos = keypad[num];
                    }
                }
            }
        }
        return answer;
    }
}