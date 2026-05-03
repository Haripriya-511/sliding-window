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

Solution: [Code](./coding-problems/src/MaxConsecutiveOnes.java)

🔹 LeetCode 3 – Longest Substring Without Repeating Characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

One-line memory:
👉 “No duplicates → expand, duplicate → shrink.”

Core idea:

Use sliding window
If char not present → expand
If duplicate → shrink until valid
Track max length

Solution: [Code](./coding-problems/src/LongestSubStringWithoutRepeatingChars.java)
