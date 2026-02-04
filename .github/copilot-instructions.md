# AI Coding Agent Instructions – DSA with Java

## Project Overview
This is an educational **Data Structures and Algorithms (DSA) learning repository** written in Java. It documents fundamental algorithms and data structures with implementations, complexity analysis, and explanatory notes.

**Key principle**: Each algorithm is self-contained in its own folder with both code and accompanying `Readme.md` documentation.

---

## Directory Structure & Organization

```
DsaWithJava/
├── Arrays/              # Foundation - covers array fundamentals and why arrays matter in DSA
├── LinearSearch/        # First searching algorithm - array traversal with a condition
├── BinarySearch/        # Advanced search - requires sorted data, logarithmic complexity
```

Each algorithm folder contains:
- **Main Java file**: Executable implementation with `main()` method
- **Readme.md**: Educational notes explaining concepts, use cases, and complexity analysis

---

## Code Conventions

### Java Project Structure
- **Package naming**: Matches folder name (e.g., `package LinearSearch;` in LinearSearch.java)
- **Entry point**: All algorithms have `public static void main(String[] args)` for standalone execution
- **Simplicity over optimization**: Code prioritizes clarity for learning; not production-hardened

### Documentation Pattern
Every algorithm's `Readme.md` follows this structure:
1. **Conceptual explanation** (plain English, no jargon)
2. **Real-world context** ("Where it's used")
3. **Step-by-step algorithm** (numbered idea section)
4. **Why it belongs in DSA hierarchy** (relationship to arrays/other fundamentals)
5. **Complexity analysis** (time & space with best/worst cases)

**Example**: [LinearSearch/Readme.md](LinearSearch/Readme.md) explains linear search as "array traversal with a condition" before diving into complexity.

---

## Conceptual Framework: Building Blocks

This repository teaches DSA as a **dependency chain**:
1. **Arrays** (foundation) → understand indexing, continuous memory, basic traversal
2. **Linear Search** (first application) → learn searching on unsorted/sorted arrays in O(n)
3. **Binary Search** (optimization) → apply divide-and-conquer, achieve O(log n) on sorted data

When extending this repo, respect this hierarchy. New algorithms should reference which previous concepts they build on.

---

## Implementation Guidelines

### When Adding New Algorithms
1. Create a folder named after the algorithm (e.g., `MergeSort/`)
2. Implement with clear variable names (prefer `target`, `arr`, `index` patterns seen in existing code)
3. Include a `main()` method with a **concrete example** (not empty)
4. Write a `Readme.md` explaining:
   - What the algorithm is in one sentence
   - Why someone should care (use case)
   - Step-by-step logic
   - Time & space complexity with best/worst/average cases

### Code Style
- **Minimal dependencies**: Each file should be standalone and executable
- **Simple loops over fancy constructs**: Use traditional `for` loops matching the style in [LinearSearch.java](LinearSearch/LinearSearch.java)
- **Direct output**: Use `System.out.println()` for results (no logging frameworks)

---

## Key Files to Reference

| File | Purpose |
|------|---------|
| [Arrays/Readme.md](Arrays/Readme.md) | Foundation concepts: why arrays are critical to DSA |
| [LinearSearch/LinearSearch.java](LinearSearch/LinearSearch.java) | Template: simple, executable implementation with concrete example |
| [LinearSearch/Readme.md](LinearSearch/Readme.md) | Template: comprehensive algorithm documentation |

---

## AI Agent Workflows

### Task: Add a New Algorithm
1. Determine the algorithm's place in the hierarchy (what prerequisites?)
2. Create the folder and base Java file with package declaration
3. Implement with a `main()` example demonstrating the algorithm
4. Write `Readme.md` following the established pattern from LinearSearch
5. If applicable, reference which earlier algorithms it builds on

### Task: Debug or Extend Existing Code
1. Check the corresponding `Readme.md` for the algorithm's expected behavior
2. Verify complexity expectations—unexpected behavior often means algorithm logic error
3. Keep modifications within the folder (don't scatter algorithm logic)

### Task: Explain an Algorithm
- Reference the algorithm's `Readme.md` first—it contains the educational context
- Mention complexity analysis; time complexity is the primary differentiator between algorithms
- Relate new concepts to earlier ones in the hierarchy (e.g., "Binary Search optimizes Linear Search by...")

---

## Common Patterns in This Codebase

**Pattern 1: Algorithm = folder + Java file + Readme**
- Avoid spreading one algorithm across multiple files
- Readme drives understanding; code drives execution

**Pattern 2: Complexity-first learning**
- Algorithms are ordered by complexity (Linear O(n) → Binary O(log n))
- Always document complexity explicitly

**Pattern 3: Executable examples over abstractions**
- `main()` methods have real test cases, not empty shells
- See [LinearSearch/LinearSearch.java](LinearSearch/LinearSearch.java): includes `arr={2,5,3,7,9,8}` and `target=5`

---

## When in Doubt

- **Complexity questions?** Check the algorithm's `Readme.md` complexity section
- **Where should new code go?** Create a new folder—don't mix algorithms
- **How verbose should Readme be?** Look at LinearSearch/Readme.md (86 lines) and Arrays/Readme.md (104 lines) as benchmarks
- **What should `main()` demonstrate?** A concrete, self-contained example that runs without external input
