import java.util.Arrays;

class Solution {
            public int countPrimes(int n) {
                int count = 0;
                boolean[] isPrime = new boolean[n];
                Arrays.fill(isPrime, true);
                for( int i = 2; i * i < n; i++)
                {
                    if( isPrime[i] == true )
                    {
                        for( int j = i*i; j < n; j += i )
                        {
                            isPrime[j] = false;
                        }
                    }
                }
                for( int i = 2; i < n; i++ )
                {
                    if( isPrime[i] == true )
                        count ++;
                } 
                return count;
            }
        };