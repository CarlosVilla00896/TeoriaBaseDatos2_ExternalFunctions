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
            throw new SQLException("com.company.COMPARESTRING(date1,date2): Invalid argument count. Requires 2, but found " + args());
        }
        String primera = value_text(0);
        String segunda = value_text(1);
        int t=0;
        if(primera.compareTo(segunda)==0){
            t=0;
        }
        else if(primera.compareTo(segunda)<0){
            t=-1;
        }else if(primera.compareTo(segunda)>0){
            t=1;
        }
        result(t);
    }
}
