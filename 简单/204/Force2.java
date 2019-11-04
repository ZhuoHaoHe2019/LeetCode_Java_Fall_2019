
public class Force2 {
    public int ForceSolution2( int n ){
        if( n < 3 )
        {
            return 1;
        }
        int count = 0;
        for( int i = 3; i < n; i++ )
        {
            boolean sign = true;
            for( int j = 3; j*j < n; j += 2 )
            {
                if( i % j == 0 )
                {
                    sign = false;
                    break;
                }
            }
            if( sign )
                count ++;
        }
        return count;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Force2 f2 = new Force2();
        System.out.println(f2.ForceSolution2(10));
    }
};