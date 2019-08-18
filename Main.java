import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws SQLException, ParseException {


       /*GestiuneBilete form = new GestiuneBilete();
       form.setVisible( true);
        EventQueue.invokeLater(() -> {
            com.company.PasswordEx ex = new com.company.PasswordEx();
            ex.setVisible(true);
        });
      */
      //Database database = new Database();
     // database.Inst_Insert();
     // database.Inst_Delete();
     // database.Inst_Update();
     // database.Inst_Select();


        JFrame mainForm = new JFrame("MainForm");
        mainForm.setContentPane(new MainForm().Panel1);
        mainForm.setSize(500,300);
        mainForm.setVisible(true);

        mainForm.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {

                EventQueue.invokeLater(() -> {
                    Login ex = new Login();
                    ex.setVisible(true);
                });
            }
            @Override
            public void windowClosing(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });




    }



}