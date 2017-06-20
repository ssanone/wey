import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;
/**
 * Created by ssanone on 2017/6/20.
 */
public class TestConnect{
    public static void main(String []args){

            String driver = "org.postgresql.Driver";
            String url = "jdbc:postgresql://localhost:5432/postgis_23_sample";
            String user = "postgres";
            String password = "1206";
            try {
                Class.forName(driver);
                Connection conn = DriverManager.getConnection(url,user,password);
                if(!conn.isClosed())
                    System.out.println("Succeeded connecting to the Database!");
                Statement statement = conn.createStatement();
                String sql = "SELECT id,name,ST_X(the_geom) as X,ST_Y(the_geom) as Y FROM cities;";

                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getString("id")+"      "+rs.getString("name")+"       "
                            +rs.getString(3)+"      " + rs.getString(4));
                }

                conn.close();
            }catch (Exception e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }

    }

}
