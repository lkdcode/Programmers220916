class Solution {
    public int solution(int[][] sizes) {
        int[][] num = new int[sizes.length][sizes[0].length];
		int max = 0;
		int min = 0;

		for (int i = 0; i < sizes.length; i++) {
			num[i][0] = Math.max(sizes[i][0], sizes[i][1]);
			num[i][1] = Math.min(sizes[i][0], sizes[i][1]);
		}

		for (int i = 0; i < sizes.length; i++) {
			max = Math.max(num[i][0], max);
			min = Math.max(num[i][1], min);
		}

		int answer = max * min;
        return answer;
    }
}