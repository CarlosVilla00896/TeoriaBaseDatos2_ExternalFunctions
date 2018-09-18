/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqliteproject;

/**
 *
 * @author PC
 */
import java.io.*;
import java.net.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.Function;


public class EXTERNAL_FUNCTION{
    
    public static void main(String[] args)
    {  
        try {
            Conexion cx = new Conexion();
            Connection conn = cx.connect();
            Statement statement = conn.createStatement();
            
            Function.create(conn, Trim.class.getSimpleName(), new Trim());
            statement.execute("select Trim('alla','a')");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, BIN2DEC.class.getSimpleName(), new BIN2DEC());
            statement.execute("select BIN2DEC(0001111)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, CompareString.class.getSimpleName(), new CompareString());
            statement.execute("select CompareString('hola','hola')");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, DEC2BIN.class.getSimpleName(), new DEC2BIN());
            statement.execute("select DEC2BIN(70)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, DEC2HEX.class.getSimpleName(), new DEC2HEX());
            statement.execute("select DEC2HEX(70)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, F2C.class.getSimpleName(), new F2C());
            statement.execute("select F2C(70)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, Factorial.class.getSimpleName(), new Factorial());
            statement.execute("select Factorial(5)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, HEX2DEC.class.getSimpleName(), new HEX2DEC());
            statement.execute("select Factorial('B7E')");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, PMT.class.getSimpleName(), new PMT());
            statement.execute("select PMT(50.5, 4, 20.5)");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, Ping.class.getSimpleName(), new Ping());
            statement.execute("select Ping('192.168.1.2')");
            System.out.println(statement.getResultSet().getString(1));
            
            Function.create(conn, Repeat.class.getSimpleName(), new Repeat());
            statement.execute("select Repeat('a',2)");
            System.out.println(statement.getResultSet().getString(1));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("Program is running..");
    }
    
     
}
