package visual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conector {

    private Connection con;
    private Statement stt;

    public conector() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avaliacoes", "root", "");

            stt = con.createStatement();
            System.out.println("sucesso!");
        } catch (Exception ex) {
            System.out.println("erro: " + ex.getMessage());
        }

    }

    public int persistir(String sql) {
        try {
            stt.executeUpdate(sql);
            ResultSet id = recupera("SELECT LAST_INSERT_ID() ");

            if (id.next()) {
                return id.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println("erro" + ex.getMessage());
        }
        return 0;
    }

    public ResultSet recupera(String sql) {
        try {
            return stt.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println("erro" + ex.getMessage());
        }
        return null;
    }

}
