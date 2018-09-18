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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.Function;


public class EXTERNAL_FUNCTION{
    
    public static void main(String[] args)
    {  
        try {
            Conexion cx = new Conexion();
            Connection conn = cx.connect();
             Function.create(conn, Trim.class.getSimpleName(), new Trim(){
                @Override
                protected void xFunc(){
                    System.out.println("Trim llamada!");
                }
            });
            conn.createStatement().execute("select Trim('alla','a')");
            
            Function.create(conn, BIN2DEC.class.getSimpleName(), new BIN2DEC(){
                @Override
                protected void xFunc(){
                    System.out.println("BIN2DEC llamada!");
                }
            });
            conn.createStatement().execute("select BIN2DEC(0001111)");
            
            Function.create(conn, CompareString.class.getSimpleName(), new CompareString(){
                @Override
                protected void xFunc(){
                    System.out.println("CompareString llamada!");
                }
            });
            conn.createStatement().execute("select CompareString('hola','hola')");
            
            Function.create(conn, DEC2BIN.class.getSimpleName(), new DEC2BIN(){
                @Override
                protected void xFunc(){
                    System.out.println("DEC2BIN llamada!");
                }
            });
            conn.createStatement().execute("select DEC2BIN(70)");
            
            Function.create(conn, DEC2HEX.class.getSimpleName(), new DEC2HEX(){
                @Override
                protected void xFunc(){
                    System.out.println("DEC2HEX llamada!");
                }
            });
            conn.createStatement().execute("select DEC2HEX(70)");
            
            Function.create(conn, F2C.class.getSimpleName(), new F2C(){
                @Override
                protected void xFunc(){
                    System.out.println("F2C llamada!");
                }
            });
            conn.createStatement().execute("select F2C(70)");
            
            Function.create(conn, Factorial.class.getSimpleName(), new Factorial(){
                @Override
                protected void xFunc(){
                    System.out.println("Factorial llamada!");
                }
            });
            conn.createStatement().execute("select Factorial(5)");
            
            Function.create(conn, HEX2DEC.class.getSimpleName(), new HEX2DEC(){
                @Override
                protected void xFunc(){
                    System.out.println("HEX2DEC llamada!");
                }
            });
            conn.createStatement().execute("select Factorial('B7E')");
            
            Function.create(conn, PMT.class.getSimpleName(), new PMT(){
                @Override
                protected void xFunc(){
                    System.out.println("PMT llamada!");
                }
            });
            conn.createStatement().execute("select PMT(50.5, 4, 20.5)");
            
            Function.create(conn, Ping.class.getSimpleName(), new Ping(){
                @Override
                protected void xFunc(){
                    System.out.println("Ping llamada!");
                }
            });
            conn.createStatement().execute("select Ping('192.168.1.2')");
            
            Function.create(conn, Repeat.class.getSimpleName(), new Repeat(){
                @Override
                protected void xFunc(){
                    System.out.println("Repeat llamada!");
                }
            });
            conn.createStatement().execute("select Repeat('ab',2)");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("Program is running..");
    }
    
     
}
