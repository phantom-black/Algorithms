class Solution {
    public int solution(String s) {
        int answer = 0;
        String tmp = s.substring(0, 1);
        if(tmp.equals("+")) {
            answer = Integer.parseInt(s.substring(1));
        } else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}