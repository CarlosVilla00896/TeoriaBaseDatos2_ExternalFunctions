package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class DEC2HEX extends Function {

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("DEC2HEX(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        int decimal = value_int(0);
        result(Integer.toHexString(decimal));
    }
    
}
