package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class C2F extends Function {

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("C2F(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        int c = value_int(0);
        result ((int)(c * 1.8) + 32);
    }
    
}
