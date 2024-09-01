package level1;

public class Mod1 {



}

class Solution3 {
    public int solution(int n) {
        int i = 1;
        while(n%i != 1){  // n을 i로 나누었을때 나머지가 1이 아니면 i를 증가
            i++;
        } return i;  // n을 i로 나누었을때 나머지가 1이면 i를 리턴
    }
}