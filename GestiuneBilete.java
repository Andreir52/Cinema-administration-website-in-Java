import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class GestiuneBilete extends JFrame{
        JLabel JL_id,JL_idCinemaRoom,JL_startHour,JL_seatNumber,JL_client;
        JTextField JT_id,JT_idCinemaRoom,JT_startHour,JT_seatNumber,JT_client;
        JButton btn_insert,btn_update,btn_delete,btn_select;
        Database database = new Database();

        public GestiuneBilete(){
            super("Gestiune Bilete");
            JL_id = new JLabel("Id:");
            JL_idCinemaRoom = new JLabel("IdCinemaRoom:");
            JL_startHour = new JLabel("Start Hour:");
            JL_seatNumber = new JLabel("Seat number:");
            JL_client = new JLabel("Client");
            JL_id.setBounds(20, 20, 100, 20);
            JL_idCinemaRoom.setBounds(20, 50, 100, 20);
            JL_startHour.setBounds(20, 80, 100, 20);
            JL_seatNumber.setBounds(20, 110, 100, 20);
            JL_client.setBounds(20, 140,100, 20);

            JT_id = new JTextField(20);
            JT_idCinemaRoom = new JTextField(20);
            JT_startHour = new JTextField(20);
            JT_seatNumber = new JTextField(20);
            JT_client = new JTextField(20);
            JT_id.setBounds(130,20,150,20);
            JT_idCinemaRoom.setBounds(130, 50, 150, 20);
            JT_startHour.setBounds(130, 80, 150, 20);
            JT_seatNumber.setBounds(130, 110, 150, 20);
            JT_client.setBounds(130, 140, 150, 20);
            btn_insert = new JButton("Insert");
            btn_update = new JButton("Update");
            btn_delete = new JButton("Delete");
            btn_select = new JButton("Select");
            btn_insert.setBounds(300, 50, 80, 20);
            btn_update.setBounds(300, 80, 80, 20);
            btn_delete.setBounds(300, 110, 80, 20);
            btn_select.setBounds(300,140,80,20);


            setLayout(null);
            add(JL_id);
            add(JL_idCinemaRoom);
            add(JL_startHour);
            add(JL_seatNumber);
            add(JL_client);
            add(JT_id);
            add(JT_idCinemaRoom);
            add(JT_startHour);
            add(JT_seatNumber);
            add(JT_client);
            add(btn_insert);
            add(btn_update);
            add(btn_delete);
            add(btn_select);



            //button insert
            btn_insert.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String idCinemaRoom = JT_idCinemaRoom.getText();
                    String startHour = JT_startHour.getText();
                    String seatNumber = JT_seatNumber.getText();
                    String client = JT_client.getText();
                    Ticket ticket = new Ticket(id, idCinemaRoom, startHour, seatNumber, client);

                    ticket.Inst_Insert( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });

            //button update
            btn_update.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String idCinemaRoom = JT_idCinemaRoom.getText();
                    String startHour = JT_startHour.getText();
                    String seatNumber = JT_seatNumber.getText();
                    String client = JT_client.getText();
                    Ticket ticket = new Ticket(id, idCinemaRoom, startHour, seatNumber, client);

                    ticket.Inst_Update( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });


            //button delete
            btn_delete.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String idCinemaRoom = JT_idCinemaRoom.getText();
                    String startHour = JT_startHour.getText();
                    String seatNumber = JT_seatNumber.getText();
                    String client = JT_client.getText();
                    Ticket ticket = new Ticket(id, idCinemaRoom, startHour, seatNumber, client);

                    ticket.Inst_Delete( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });

            //button select
            btn_select.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String idCinemaRoom = JT_idCinemaRoom.getText();
                    String startHour = JT_startHour.getText();
                    String seatNumber = JT_seatNumber.getText();
                    String client = JT_client.getText();
                    Ticket ticket = new Ticket(id, idCinemaRoom, startHour, seatNumber, client);

                    ticket.Inst_Select( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });


            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setLocationRelativeTo(null);
            setSize(500,200);

        }






}
