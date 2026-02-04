# Arrays – Notes & Revision

## What an array actually is
An array is a way to store multiple values of the same type in **continuous memory**.
Each element is accessed using an **index**, starting from `0`.

Array itself is not an algorithm.
It is just a **container for data**.
All problem-solving comes from how we use loops, conditions, and logic on it.

---

## Why arrays come first in DSA
Arrays are the foundation of almost everything:
- Searching
- Sorting
- Two pointers
- Sliding window
- Binary search (on sorted arrays)

If arrays are clear, most DSA problems become easier to think about.

---

## Core things to always remember
- Index starts from `0`
- Last index = `length - 1`
- Traversal usually means `for (i = 0 to n-1)`
- Most array problems are about:
  - scanning
  - comparing
  - counting
  - updating values

If a solution uses a **simple loop**, it’s probably an array-based problem.

---

## Linear Search (belongs to arrays)
Linear search is just **array traversal**.

Idea:
- Check elements one by one
- Stop when found

Important points:
- Works on any array
- Sorted or unsorted does not matter
- Time complexity: O(n)

This is why linear search fits naturally inside arrays.

---

## Common array problem patterns
Most array questions fall into these patterns:
- Finding max / min
- Frequency counting
- Prefix sum
- Subarrays
- Rotation and reversal
- Index-based conditions

Usually, no advanced algorithm is needed — only clear logic.

---

## Common mistakes to avoid
- Off-by-one errors (`< n` vs `<= n`)
- Ignoring edge cases (empty array, size 1)
- Modifying the array when not required
- Overcomplicating simple traversal problems

---

## Quick thinking checklist
Before coding, ask:
1. Do I need one pass or multiple passes?
2. Do I need extra space?
3. Can I track the answer while traversing?
4. Is index position important?

If yes → arrays are enough.

---

## Relation with other topics
- Arrays → foundation
- Linear search → simple traversal
- Binary search → separate optimized pattern
- Two pointers / sliding window → advanced array techniques

Arrays never disappear; they just turn into patterns.

---

## Final note to myself
If an array problem feels hard:
- Write the array
- Simulate by hand
- Slow down

Most array problems are simpler than they first appear.
