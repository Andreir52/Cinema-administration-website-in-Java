import java.sql.*;
import java.util.Date;

public class Ticket {
    String Id;
    String IdCinemaRoom;
    String StartHour;
    String SeatNumber;
    String Client;

    public Ticket(String id, String idCinemaRoom, String startHour, String sitNumber, String client) {
        Id = id;
        IdCinemaRoom = idCinemaRoom;
        StartHour = startHour;
        SeatNumber = sitNumber;
        Client = client;
    }

    public void Inst_Insert( Connection con) throws SQLException {
        Statement insert = null;
        insert = con.createStatement();
        int inserted = 0;
        inserted = insert.executeUpdate("INSERT INTO Ticket (Id, IdCinemaRoom, StartHour, SeatNumber, Client) VALUES (" + Id + ","+ IdCinemaRoom + ","+  "\"" + StartHour +  "\"" +  ","+ SeatNumber + ","+  "\""+Client + "\""+  ")");
        if(inserted > 0){
            System.out.println("Ticket in");
        }
        else {
            System.out.println("Error Ticket");
        }

    }

    public void Inst_Update( Connection con )throws SQLException{
        Statement update = null;
        update = con.createStatement();
        String query = "UPDATE Ticket SET StartHour =" + "\"" + StartHour +  "\"" + ","+" Client = " + "\"" + Client + "\"" + ","+"IdCinemaRoom = " + IdCinemaRoom + ","+"SeatNumber = " + SeatNumber +  " WHERE Id = " + Id;
        System.out.println(query);
        //count will give you how many records got updated
        int count = 0;
        count = update.executeUpdate(query);
        System.out.println("Updated queries: "+count);
    }

    public void Inst_Select( Connection con) throws SQLException {
        Statement select = con.createStatement();
        ResultSet rs = select.executeQuery("SELECT * FROM Ticket WHERE IdCinemaRoom = " + IdCinemaRoom);
        while(rs.next()){
            //System.out.println(rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
        }

    }

    public void Inst_Delete( Connection con )throws SQLException{
        Statement delete = null;
        delete = con.createStatement();
        int deleteResult = 0;
        deleteResult = delete.executeUpdate("DELETE FROM Ticket WHERE Id = " + Id);
        if(deleteResult > 0){
            System.out.println("S-au sters " + deleteResult + "bilete");
        } else {
            System.out.println("Nu a fost sters niciun bilet"); }
    }
}
