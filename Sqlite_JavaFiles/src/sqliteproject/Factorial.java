package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class Factorial extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if (args()!=1)
            throw new SQLException("Factorial(dato1): Invalid argument count. Requires 1, but found " + args());
        
        int val = value_int(0);
        int res = 1;  
        
        for(int x=1;x<=val;x++){    
            res=res*x;    
        }    
        result (res);
    }
    
}
