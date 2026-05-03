🔹 LeetCode 1423 – Maximum Points You Can Obtain from Cards

**Link**: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

One-line memory:
👉 “Pick k from ends = remove smallest middle subarray.”

Core idea:

Taking from ends = leaving a middle block
So:
max score = total sum − minimum subarray of size (n − k)

Solution: [Java Code](./coding-problems/src/MaxPointsFromCards.java)

🔹 LeetCode 1004 – Max Consecutive Ones III

Link: https://leetcode.com/problems/max-consecutive-ones-iii/

One-line memory:
👉 “Expand window, allow ≤ k zeroes, shrink when exceeded.”

Core idea:

Maintain window with ≤ k zeroes
If zeroes > k → shrink from left

Solution: [Java Code](./coding-problems/src/MaxConsecutiveOnes.java)

🔹 LeetCode 3 – Longest Substring Without Repeating Characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

One-line memory:
👉 “No duplicates → expand, duplicate → shrink.”

Core idea:

Use sliding window
If char not present → expand
If duplicate → shrink until valid
Track max length

Solution: [Java Code](./coding-problems/src/LongestSubStringWithoutRepeatingChars.java)

🔹 LeetCode 904 – Fruit Into Baskets

Link: https://leetcode.com/problems/fruit-into-baskets/

One-line memory:
👉 “At most 2 types → expand, more than 2 → shrink.”

Core idea:

Use sliding window
Maintain a map to track fruit counts
If distinct fruits ≤ 2 → expand
If > 2 → shrink until valid
Track maximum window length

Solution: [Java Code](./coding-problems/src/FruitsIntoBasket.java)

🔹 LeetCode – Longest Substring with At Most K Distinct Characters
Link: https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/

One-line memory:
👉 “At most K distinct → expand, >K → shrink.”
Core idea:

Use sliding window

Maintain a map for character frequency

If distinct chars ≤ k → expand

If > k → shrink from left until valid

Track maximum window length

Solution: [Java Code](./coding-problems/src/LongestSubstringAtmostKDistinctChars.java)

🔹 LeetCode 424 – Longest Repeating Character Replacement

Link: https://leetcode.com/problems/longest-repeating-character-replacement/

One-line memory:
👉 “Window size − maxFreq ≤ k → expand, else shrink.”

Core idea:

Use sliding window
Track frequency of characters using map/array
Maintain maxFreq = highest frequency in window (only increasing)
If (window size − maxFreq) > k → shrink from left
Track maximum window length

Important note:

maxFreq is not decreased while shrinking
It can be stale, but still works
Because we only care about maximum valid window length, not exact window validity every time

Pattern: Sliding Window

Solution: [Java Code](./coding-problems/src/LongestCharacterRepeatingPlacement.java)

🔹 LeetCode 76 – Minimum Window Substring

Link: https://leetcode.com/problems/minimum-window-substring/

One-line memory:
👉 “Expand to cover all chars, shrink to get minimum window.”

Core idea:

Use sliding window + frequency map
Store required characters from t
Expand window until all chars are matched
Then shrink from left to minimize window
Track smallest valid window

Important note:

Map stores remaining required counts
Negative values = extra characters
Window valid when all characters matched

Pattern: Sliding Window

Solution: [Java code](./coding-problems/src/MinWindowSubString.java)
