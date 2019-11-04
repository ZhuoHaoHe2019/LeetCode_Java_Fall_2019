/*
ReverseInt
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment which could only 
store integers within the 32-bit signed integer range: [−231,
231 − 1]. For the purpose of this problem, assume that your 
function returns 0 when the reversed integer overflows.

EXAMPLE:
    Input: 120
    Output: 21

    Input: -123
    Output: -321
*/

class Solution {
    public int reverse(int x) {
        //需要判断反转之后的数组是不是溢出的
        int rev = 0;
        int pop = 0;
        while( x != 0 )
        {
            pop = x % 10;
            x /= 10;
            if(( rev > 214748364 ) || 
            (( rev == 214748364 ) && ( pop == 7 )))
                return 0;
            if(( rev < -214748364 ) || 
            (( rev == -214748364 ) && ( pop == -8 )))
                return 0;
            rev = 10*rev + pop;
        }
        return rev;
    }
}