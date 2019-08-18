import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CinemaRoom {
    String Id;
    String CName;
    String Capacity;
    String idManager;
    String OpenFrom;
    String OpenTo;

    public CinemaRoom(String id, String name, String capacity, String idManager, String openFrom, String openTo) {
        Id = id;
        CName = name;
        Capacity = capacity;
        this.idManager = idManager;
        OpenFrom = openFrom;
        OpenTo = openTo;
    }


    public void Inst_Insert( Connection con) throws SQLException {
        Statement insert = null;
        insert = con.createStatement();
        int inserted = 0;
       // System.out.println("INSERT INTO CinemaRoom (Id, Name, Capacity, IdManager, OpenFrom, OpenTo) VALUES (" + Id + ","+ CName + ","+ Capacity + ","+ idManager + ","+ OpenFrom + ","+ OpenTo + ")");
        inserted = insert.executeUpdate("INSERT INTO CinemaRoom (Id, CName, Capacity, IdManager, OpenFrom, OpenTo) VALUES (" + Id + ","+ "\"" +CName +  "\"" + ","+ Capacity + ","+ idManager + ","+  "\""+OpenFrom + "\""+ ","+ "\""+ OpenTo + "\""+ ")");
        if(inserted > 0){
            System.out.println("Cinema room in");
        }
        else {
            System.out.println("Error Cinema room");
        }

    }

    public void Inst_Update( Connection con )throws SQLException{
        Statement update = null;
        update = con.createStatement();
        String query = "UPDATE CinemaRoom set CName =" + "\"" +CName +  "\"" + ","+"Capacity = " + Capacity + ","+"IdManager = " + idManager + ","+"OpenFrom = " +  "\""+OpenFrom + "\""+ ","+"OpenTo = " + "\""+ OpenTo + "\"" + "WHERE Id = " + Id;
        System.out.println(query);
        //count will give you how many records got updated
        int count = 0;
        count = update.executeUpdate(query);
        System.out.println("Updated queries: "+count);
    }

}
