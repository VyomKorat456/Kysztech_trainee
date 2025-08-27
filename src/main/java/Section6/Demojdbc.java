package Section6;

import java.sql.*;

import static java.lang.Class.forName;

public class Demojdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*

        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close

         */



        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uname = "postgres";
        String pass = "250604";
        String query = "insert into student values(?,?,?)";

//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");

        con.setAutoCommit(false);

        try(PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, 111);
            ps.setInt(2, 80);
            ps.setString(3, "jon");
            ps.addBatch();

            ps.setInt(1, 112);
            ps.setInt(2, 89);
            ps.setString(3, "den");
            ps.addBatch();

            ps.setInt(1, 113);
            ps.setInt(2, 90);
            ps.setString(3, "week");
            ps.addBatch();

            int[] result = ps.executeBatch();
            con.commit();

            System.out.println("Batch executed successfully. Rows affected: " + result.length);


        }catch (SQLException e){
            con.rollback();
            System.out.println("batch failed.transaction rolled");
            e.printStackTrace();
        }

    }
}
