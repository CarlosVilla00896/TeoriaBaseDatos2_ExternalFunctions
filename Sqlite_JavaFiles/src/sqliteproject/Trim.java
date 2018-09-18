package sqliteproject;
import org.sqlite.Function;

import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Trim extends Function{

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 2) {
            throw new SQLException("Trim(date1,date2): Invalid argument count. Requires 2, but found " + args());
        }
        String _new = value_text(0);
        String remover = value_text(1);
        Boolean flag = true,flag2 = true;
        while(flag || flag2)
        {
            if(_new.charAt(0) == remover.charAt(0))
            {
                StringBuilder temp = new StringBuilder(_new);
                _new = temp.deleteCharAt(0).toString();
            }
            else 
                flag = false;
            
            if(_new.charAt(_new.length()-1) == remover.charAt(0))
            {
                StringBuilder temp = new StringBuilder(_new);
                _new = temp.deleteCharAt(_new.length()-1).toString();
            }
            else 
                flag2 = false;
        }
        result (_new);
    }
    
}
