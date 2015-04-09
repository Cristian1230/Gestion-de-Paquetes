package gestion.de.paqutes;

import java.sql.*;
import javax.swing.JOptionPane;


public class GestionDePaqutes{

    
    /**
     * guarda un String de la db
     */
    public String db = "envios.sqlite";
    //URL del driver
    public String url = "jdbc:sqlite:"+db;
   
    //user de la bd
    public String user = "root";
    
    //pass del user de la bd
    public String pass = "123";

    public Connection Conectar() {

        Connection link = null;

        try {

            Class.forName("org.sqlite.JDBC");

            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);

        }

        return link;

    }

}