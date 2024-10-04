class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++) {
            answer[i] = calcYearning(name, yearning, photo[i]);
        }

        return answer;
    }

    public int calcYearning(String[] name, int[] yearning, String[] photo) {
        int score = 0;
        for (String s : photo) {
            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(s)) {
                    score += yearning[i];
                }
            }
        }
        return score;
    }
}