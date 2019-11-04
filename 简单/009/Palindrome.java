/*
 *  Determine whether an integer is a palindrome.
 *  An integer is a palindrome when it reads the same backward as forward. 
 * 
 * Follow up:
 * Could you solve it without converting the integer to a string?
 * 
 * EXAMPLE
 *      Input: 121
        Output: true

        Input: -121
        Output: false

        Input: 10
        Output: false
 * 
 *  */ 
class NiceSolution {
    public boolean isPalindrome(int x) {
    //倒转一半
    if( x < 0 || ( x % 10 == 0  && x != 0 ) )
        return false;

    int rev = 0;
    while( x > rev )
    {
        rev = rev * 10 + x % 10;
        x = x / 10;
    }
    
    if( rev == x || x == rev / 10 )
        return true;
    else 
        return false;
    }
}