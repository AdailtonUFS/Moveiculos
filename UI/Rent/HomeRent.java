package UI.Rent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Cursor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeRent extends JFrame {

    public static void main(String[] args) {
        try {
            HomeRent frame = new HomeRent();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HomeRent() {
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        setTitle("Aluguel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 810, 710);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton buttonRegister = new JButton("Cadastrar");
        buttonRegister.setFont(new Font("Arial", Font.BOLD, 13));
        buttonRegister.setBounds(160, 270, 130, 130);
        contentPane.add(buttonRegister);

        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CreateRent frame = new CreateRent();
                    frame.setVisible(true);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

    }
}