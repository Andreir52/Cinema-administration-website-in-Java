import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;

public class MainForm {
    private JButton GestiuneSali;
    private JButton GestiuneBilete;
    public JPanel Panel1;

    public MainForm() throws ParseException, SQLException, NumberFormatException {
        GestiuneSali.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // formul cu Add + adaugare in tabel

                EventQueue.invokeLater(() -> {
                    GestiuneSali ex = null;
                    try {
                        ex = new GestiuneSali();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    } catch (ParseException e1) {
                        e1.printStackTrace();
                    }


                    ex.setVisible(true);
                    ex.setSize(500,300);
                    /*ex.setContentPane(new GestiuneSali().Panel3);
                    ex.pack();*/
                });
            }
        });
        GestiuneBilete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                // formul cu Edit + editare in tabel

                EventQueue.invokeLater(() -> {
                    GestiuneBilete ex = new GestiuneBilete();
                    ex.setVisible(true);
                    ex.setSize(500, 300);
                    /*ex.setContentPane(new GestiuneBilete().Panel2);
                    ex.pack();*/
                });
            }
        });
    }


}
