package sqliteproject;
import org.sqlite.Function;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class Repeat extends Function{
    protected void xFunc() throws SQLException {
        if (args() != 2) {
            throw new SQLException("Repeat(dato1, dato2): Invalid argument count. Requires 2, but found " + args());
        }
        String cadena = value_text(0);
        int rep = value_int(1);
        String temp = "";
        for(int x = 0; x<rep; x++){
            temp+=cadena;
        }
        result(temp);
    }
}
