package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class HEX2DEC extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {  
            throw new SQLException("HEX2DEC(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        String hexadecimal = value_text(0);
        result(Integer.parseInt(hexadecimal, 16));
    }
    
}
