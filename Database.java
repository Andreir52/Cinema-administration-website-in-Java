
import java.sql.*;

public class Database {

     Connection con;
     Statement st;
     ResultSet rs;

    public Database ()
    {
        try
        {   Class.forName("com.mysql.jdbc.Driver");
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:8889/CinemaRoom";

            con = DriverManager.getConnection( url, userName, password );

            System.out.println( "Database connection established" );


        }
        catch(Exception e) {
            System.out.println("ERROR" + e);
        }

    }

    public void Inst_Select() throws SQLException {
       Statement select = con.createStatement();
       rs = select.executeQuery("select * from caca");
        while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }


    }

    public void Inst_Insert() throws SQLException {
        Statement insert = null;
        insert = con.createStatement();
        int inserted = 0;
        inserted = insert.executeUpdate("INSERT INTO caca (Id, Name, Phone) VALUES (12,'ion', '000000')");

        if(inserted > 0){
            System.out.println("Client introdus");
        }
        else {
            System.out.println("NU s-a putut insera clientul");
        }

    }

    public void Inst_Delete()throws SQLException{
        Statement delete = null;
            delete = con.createStatement();
        int deleteResult = 0;
            deleteResult = delete.executeUpdate("DELETE FROM caca WHERE Name = 'ion'");
        if(deleteResult > 0){
            System.out.println("S-au sters " + deleteResult + " clienti");
        } else {
            System.out.println("Nu a fost sters niciun client"); }
    }

    public void Inst_Update()throws SQLException{
        Statement update = null;
            update = con.createStatement();
        String query = "update caca set Name = 'Popescu' where Id = 12";
        //count will give you how many records got updated
        int count = 0;
            count = update.executeUpdate(query);
        System.out.println("Updated queries: "+count);
    }
}
