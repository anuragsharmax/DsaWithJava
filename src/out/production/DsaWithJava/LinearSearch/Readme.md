# Linear Search – Notes & Revision

## What Linear Search really is
Linear search is the **simplest way to search** for an element in a collection.
We start from the first element and check **one by one** until we either find
the target or reach the end.

There is no shortcut, no assumption, no trick.
Just checking elements sequentially.

---

## Where linear search is used
Linear search works on:
- Sorted arrays
- Unsorted arrays

Order does NOT matter because we are not skipping any elements.

That’s why linear search is often the **first searching algorithm** we learn.

---

## Basic idea (in words)
1. Start from index `0`
2. Compare current element with target
3. If match → stop
4. If not → move to next element

If we reach the end, the element is not present.

---

## Why linear search belongs with arrays
Linear search is basically **array traversal with a condition**.
It uses:
- Indexing
- Loops
- Direct element comparison

So it naturally fits with array fundamentals.

---

## Time & Space Complexity
- Time Complexity:
  - Best case: `O(1)` (element at first index)
  - Worst case: `O(n)` (element at last index or not present)
- Space Complexity:
  - `O(1)` (no extra space)

---

## When linear search is a bad choice
- Large datasets
- When faster searching is required
- When data is already sorted (binary search is better)

Still, linear search is useful when:
- Data is small
- Data is unsorted
- Simplicity matters more than speed

---

## Common mistakes to avoid
- Comparing index with target instead of value
- Forgetting to stop after finding the element
- Not handling the “not found” case
- Off-by-one errors in loop condition

---

## Mental reminder
If the solution says:
> “Check every element until you find it”

Then linear search is the correct approach.

---

## Final note to myself
Linear search may look too simple,
but understanding it properly makes learning
binary search and advanced patterns much easier.
