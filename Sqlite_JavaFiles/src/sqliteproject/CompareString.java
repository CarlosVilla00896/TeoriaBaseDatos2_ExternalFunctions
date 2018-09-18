package sqliteproject;
import java.sql.SQLException;
import org.sqlite.Function;

/**
 *
 * @author PC
 */
public class CompareString extends Function{
    @Override
    protected void xFunc() throws SQLException {
        if (args() != 2) {
            throw new SQLException("CompareString(dato1, dato2): Invalid argument count. Requires 2, but found " + args());
        }
        String cadena1 = value_text(0);
        String cadena2 = value_text(1);
        if(cadena1.length() < cadena2.length())
            result(-1);
         else if(cadena1.equals(cadena2))
            result(0);
        else if(cadena1.length() > cadena2.length())
            result(1);
        result(9999999);
    }
}
