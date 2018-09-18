

package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class BIN2DEC extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("Trim(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        String bin = value_text(0);
        result (Integer.parseInt(bin, 2));
    }
    
}
