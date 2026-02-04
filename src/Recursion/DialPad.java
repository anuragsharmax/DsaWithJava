/*
Leetcode-17
Dial Pad Letter Combinations using Recursion

Problem:
- Given a string of digits (2–9), generate all possible letter combinations
  based on the phone keypad mapping.
- Order matters, so combinations like "ad" and "da" are different.

Approach:
- Use recursion to process one digit at a time.
- For the current digit, try all characters mapped to it.
- Add one character to the current string and recurse for remaining digits.

Parameters:
- `digits` : remaining digits to process
- `p`      : partial string (combination formed so far)

Base Cases:
1. If digits is empty AND p is empty:
   - This means the input itself was empty.
   - Return an empty list (avoids returning [""]).
2. If digits is empty:
   - A valid combination is formed.
   - Add `p` to the result list and return.

Recursive Case:
- Take the first digit and get its corresponding letters.
- Loop over each letter:
    - Append it to `p`
    - Recurse for the remaining digits
    - Collect all returned combinations

Important Notes:
- Mapping for digits 0 and 1 is empty, as they do not produce letters.
- `substring(1)` moves the recursion forward by one digit.
- String concatenation (p + ch) ensures each recursive call has its own path.

This ensures:
- All valid combinations are generated
- No duplicates
- Proper handling of empty input
*/

package Recursion;

import java.util.ArrayList;

public class DialPad {
    static void main(String[] args) {
        System.out.println(pad("34",""));
    }
    static ArrayList<String> pad(String digits,String p){
        if(digits.length()==0&&p.length()==0){
            return new ArrayList<>();
        }
        ArrayList<String> ans=new ArrayList<>();
        if(digits.isEmpty()){
            ans.add(p);
            return ans;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int digit=digits.charAt(0)-'0';
        String al=map[digit];
        for(int i=0;i<al.length();i++){
            char ch=al.charAt(i);
            ans.addAll(pad(digits.substring(1),p+ch));
        }
        return ans;
    }
}
