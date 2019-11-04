public class ForceSolution {
    public int countPrime1( int n ){
        int count = 0;
        for( int i = 2; i < n; i++ )
        {
            boolean sign = true;
            for( int j = 2; j * j < n; j++ )
            {
                if( i % j == 0 )
                {
                    sign = false;
                    break; 
                }
            }
            if( sign == true )
                count ++;
        } 
        return count;
    }
    public static void main(String[] args) {
        ForceSolution fs = new ForceSolution();
        int x = fs.countPrime1(10);
        System.out.println( x );
    }
};