package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class F2C extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if(args()!=1){
            throw new SQLException("F2C(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        int f = value_int(0);
        result ((int)((f-32) *  0.5556));
    }
    
}
