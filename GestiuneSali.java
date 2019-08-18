import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;

public class GestiuneSali extends JFrame{

        JLabel JL_name,JL_capacity,JL_idManager,JL_id,JL_startHour, JL_stopHour;
        JTextField JT_name,JT_capacity,JT_idManager,JT_id, JT_startHour, JT_stopHour;
        JButton btn_insert,btn_update;

        Database database = new Database();
        public GestiuneSali() throws SQLException, ParseException {
            super("Gestiune Sali");
            JL_id = new JLabel("Id:");
            JL_name = new JLabel("Name:");
            JL_capacity = new JLabel("Capacity:");
            JL_idManager = new JLabel("Id Manager:");
            JL_startHour = new JLabel("Start Hour:");
            JL_stopHour = new JLabel("Stop Hour:");
            JL_id.setBounds(20, 20, 100, 20);
            JL_name.setBounds(20, 50, 100, 20);
            JL_capacity.setBounds(20, 80, 100, 20);
            JL_idManager.setBounds(20, 110, 100, 20);
            JL_startHour.setBounds(20, 140,100,20);
            JL_stopHour.setBounds(20, 170,100,20);

            JT_id = new JTextField(20);
            JT_name = new JTextField(20);
            JT_capacity = new JTextField(20);
            JT_idManager = new JTextField(20);
            JT_startHour = new JTextField(20);
            JT_stopHour = new JTextField(20);
            JT_id.setBounds(130,20,150,20);
            JT_name.setBounds(130, 50, 150, 20);
            JT_capacity.setBounds(130, 80, 150, 20);
            JT_idManager.setBounds(130, 110, 150, 20);
            JT_startHour.setBounds(130, 140, 150, 20);
            JT_stopHour.setBounds(130, 170, 150, 20);
            btn_insert = new JButton("Insert");
            btn_update = new JButton("Update");
            btn_insert.setBounds(300, 50, 80, 20);
            btn_update.setBounds(300, 80, 80, 20);



            setLayout(null);
            add(JL_id);
            add(JL_name);
            add(JL_capacity);
            add(JL_idManager);
            add(JL_startHour);
            add(JL_stopHour);
            add(JT_id);
            add(JT_name);
            add(JT_capacity);
            add(JT_idManager);
            add(JT_startHour);
            add(JT_stopHour);
            add(btn_insert);
            add(btn_update);



            //button insert
            btn_insert.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String name = JT_name.getText();
                    String capacity = JT_capacity.getText();
                    String id_manager = JT_idManager.getText();
                    String startHour = JT_startHour.getText();
                    String stopHour = JT_stopHour.getText();
                    CinemaRoom cinema = new CinemaRoom(id,name,capacity,id_manager,startHour,stopHour);

                    cinema.Inst_Insert( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });

           //button update
            btn_update.addActionListener(e -> {
                try {
                    String id = JT_id.getText();
                    String name = JT_name.getText();
                    String capacity = JT_capacity.getText();
                    String id_manager = JT_idManager.getText();
                    String startHour = JT_startHour.getText();
                    String stopHour = JT_stopHour.getText();
                    CinemaRoom cinema = new CinemaRoom(id,name,capacity,id_manager,startHour,stopHour);

                    cinema.Inst_Update( database.con );
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            });

        }
}
