import java.util.*;
import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        
        ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {
			char ch = strings[i].charAt(n);
			arr.add(ch + strings[i]);
		}

		Collections.sort(arr);

		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i).substring(1);
		}
        
        return answer;
    }
}