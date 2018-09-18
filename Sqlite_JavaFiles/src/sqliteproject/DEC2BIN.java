package sqliteproject;
import java.sql.SQLException;
import org.sqlite.Function;
/**
 *
 * @author PC
 */
public class DEC2BIN extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("DEC2BIN(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        int num = value_int(0);
        StringBuilder bin = new StringBuilder();
        while(num > 0)
        {
            bin.append(num%2);
            num = num/2;
        }
        result (bin.reverse().toString());
    }
    
}
