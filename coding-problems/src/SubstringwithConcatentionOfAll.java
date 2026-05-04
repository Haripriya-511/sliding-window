import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatentionOfAll {
        public static List<Integer> findSubstring(String s, String[] words) {
            List<Integer> res = new ArrayList<>();

            int wordLen = words[0].length();
            int wordCount = words.length;
            int n = s.length();

            // Step 1: Build target frequency map
            Map<String, Integer> target = new HashMap<>();
            for (String w : words) {
                target.put(w, target.getOrDefault(w, 0) + 1);
            }

            // Step 2: Try all offsets  `
            for (int start = 0; start < wordLen; start++) {

                int left = start;
                int right = start;
                int count = 0;

                Map<String, Integer> window = new HashMap<>();

                // Step 3: Traverse in chunks
                while (right + wordLen <= n) {

                    String word = s.substring(right, right + wordLen);
                    right += wordLen;

                    // Step 4: Valid word
                    if (target.containsKey(word)) {

                        window.put(word, window.getOrDefault(word, 0) + 1);
                        count++;

                        // Step 5: Shrink if extra
                        while (window.get(word) > target.get(word)) {
                            String leftWord = s.substring(left, left + wordLen);
                            window.put(leftWord, window.get(leftWord) - 1);
                            left += wordLen;
                            count--;
                        }

                        // Step 6: Valid window
                        if (count == wordCount) {
                            res.add(left);
                        }

                    }
                    else {
                        // Step 7: Reset window
                        window.clear();
                        count = 0;
                        left = right;
                    }
                }
            }

            return res;
        }

    static void main(String[] args) {
       String s = "barfoofoobarthefoobarman";
       String words[]= {"the","foo","bar"};
        System.out.println(findSubstring(s,words));
    }
}
