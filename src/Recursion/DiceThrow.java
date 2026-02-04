/*
Dice Throw using Recursion

Idea:
- We want to generate all possible sequences of dice throws (1 to 6)
- such that the sum of values equals the given target.
- Order matters, so [1,3] and [3,1] are treated as different sequences.

How recursion works here:
- `target` represents the remaining sum we need to achieve.
- `p` stores the sequence built so far.

Base Case:
- When target becomes 0, it means we have formed a valid sequence.
- Print the sequence and stop further recursion from that path.

Recursive Case:
- Try all possible dice values from 1 to 6.
- Also make sure the dice value does not exceed the remaining target.
- For each value:
    - Reduce the target by that value
    - Add the value to the current path
    - Recurse further

Important Note:
- Dice values start from 1 (not 0).
- Using 0 would not reduce the target and cause infinite recursion.

This approach ensures:
- All valid combinations are generated
- No infinite recursion
- Clear progression toward the base case
*/

package Recursion;

public class DiceThrow {
    static void main(String[] args) {
        order(4,"");
    }
    static void order(int target,String p){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target&&i<=6;i++){
            int currVal=i;
            order(target-i,p+i);
        }
    }
}
