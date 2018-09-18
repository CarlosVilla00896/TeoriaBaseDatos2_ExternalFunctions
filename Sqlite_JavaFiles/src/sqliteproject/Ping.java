package sqliteproject;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.sqlite.Function;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class Ping extends Function {

    @Override
    protected void xFunc() throws SQLException {
        if (args() != 1) {
            throw new SQLException("Ping(dato1): Invalid argument count. Requires 1, but found " + args());
        }
        String ipAddress = value_text(0);
        try{
            InetAddress inet = InetAddress.getByName(ipAddress);
            result(inet.isReachable(5000) ? 1 : 0);

        } catch (UnknownHostException e) {
            result(0);
        } catch (IOException e) {
            result(0);
        }
    }
    
}
