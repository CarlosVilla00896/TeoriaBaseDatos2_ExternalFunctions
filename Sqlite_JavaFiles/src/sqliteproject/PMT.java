package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class PMT extends Function {

    @Override
    protected void xFunc() throws SQLException {
        if(args()!=3){
            throw new SQLException("PMT(dato1,dato2,dato3): Invalid argument count. Requires 3, but found " + args());
        }
        double ti = value_double(0);
        int npr =  value_int(1);
        double pv = value_double(2);
        result  ((pv*ti)/(1 - (Math.pow((1 + ti), -npr))));
    }
    
}
