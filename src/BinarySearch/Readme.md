# Binary Search – Notes & Revision

## What Binary Search really is
Binary search is a **smart searching technique** where we reduce the search space
by half in every step.

Instead of checking elements one by one, we:
- Look at the middle element
- Decide whether to go left or right
- Repeat until the element is found or the range becomes invalid

The key idea is **elimination**.

---

## MOST IMPORTANT RULE (never forget)
Binary search works **ONLY on sorted data**.

If the array is not sorted:
- Binary search logic breaks
- Result becomes incorrect

Sorted array is a **hard requirement**, not a suggestion.

---

## Basic idea (in words)
1. Take left = 0, right = n - 1
2. Find middle index
3. Compare middle element with target
4. If equal → found
5. If target is bigger → go right
6. If target is smaller → go left
7. Repeat until left > right

If left crosses right → element not present

---

## Why binary search is fast
In every step:
- Half of the elements are discarded

So instead of checking `n` elements:
- We check `log₂(n)` elements

This makes binary search extremely efficient for large datasets.

---

## Time & Space Complexity
- Time Complexity: `O(log n)`
- Space Complexity:
  - Iterative version: `O(1)`
  - Recursive version: `O(log n)` (call stack)

---

## Why binary search is a separate topic
Binary search is not just for arrays.

The same idea is used in:
- Searching in rotated arrays
- Finding first / last occurrence
- Lower bound / upper bound
- Binary search on answer
- Optimization problems

That’s why binary search is treated as a **pattern**, not just an algorithm.

---

## Common mistakes to avoid
- Applying binary search on unsorted array
- Infinite loop due to wrong mid or boundary update
- Using `(left + right) / 2` without thinking about overflow
- Forgetting the `left <= right` condition

---

## Mental checklist before using binary search
Before writing code, ask:
1. Is the data sorted?
2. Can I decide left or right by comparing mid?
3. Am I shrinking the search space every step?

If all answers are yes → binary search is valid.

---

## Linear Search vs Binary Search (quick reminder)
- Linear search:
  - Works on any array
  - Slow for large input
- Binary search:
  - Needs sorted array
  - Very fast

Use the right tool for the right situation.

---

## Final note to myself
Binary search is simple in idea but tricky in implementation.
Most bugs come from boundary mistakes, not from the concept.

If binary search feels confusing:
- Write the array
- Track left, mid, right on paper
- Simulate step by step

Once understood, this pattern appears everywhere in DSA.
