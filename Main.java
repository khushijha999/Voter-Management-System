import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {

        // Frame settings
        setTitle("Voter Management System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(245, 247, 250));

        // ================= HEADER =================
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(30, 60, 114));
        headerPanel.setPreferredSize(new Dimension(900, 90));

        JLabel title = new JLabel("VOTER MANAGEMENT SYSTEM");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitle = new JLabel("Secure • Simple • Reliable Voting Management");
        subtitle.setForeground(Color.WHITE);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel headingBox = new JPanel();
        headingBox.setLayout(new GridLayout(2, 1));
        headingBox.setBackground(new Color(30, 60, 114));

        headingBox.add(title);
        headingBox.add(subtitle);

        headerPanel.add(headingBox, BorderLayout.CENTER);

        // ================= CENTER =================
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(new Color(245, 247, 250));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 20, 15, 20);

        JLabel welcomeLabel = new JLabel("Welcome to Voter Management System");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(new Color(30, 60, 114));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;

        centerPanel.add(welcomeLabel, gbc);

        JLabel infoLabel = new JLabel(
                "<html><center>Manage voter registration, elections and voting<br>" +
                "through a simple and secure system.</center></html>"
        );

        infoLabel.setFont(new Font("Arial", Font.PLAIN, 16));

        gbc.gridy = 1;
        centerPanel.add(infoLabel, gbc);

        // ================= BUTTONS =================

        JButton voterButton = new JButton("VOTER LOGIN");
        JButton adminButton = new JButton("ADMIN LOGIN");
        JButton registerButton = new JButton("VOTER REGISTRATION");
        JButton exitButton = new JButton("EXIT");

        // Button design
        JButton[] buttons = {
                voterButton,
                adminButton,
                registerButton,
                exitButton
        };

        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(220, 50));
            button.setFont(new Font("Arial", Font.BOLD, 14));
            button.setFocusPainted(false);
        }

        gbc.gridwidth = 1;

        // Voter Login
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(voterButton, gbc);

        // Admin Login
        gbc.gridx = 1;
        gbc.gridy = 2;
        centerPanel.add(adminButton, gbc);

        // Registration
        gbc.gridx = 0;
        gbc.gridy = 3;
        centerPanel.add(registerButton, gbc);

        // Exit
        gbc.gridx = 1;
        gbc.gridy = 3;
        centerPanel.add(exitButton, gbc);

        // ================= FOOTER =================

        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(30, 60, 114));

        JLabel footerLabel = new JLabel(
                "© 2026 Voter Management System | College Project"
        );

        footerLabel.setForeground(Color.WHITE);
        footerLabel.setFont(new Font("Arial", Font.PLAIN, 13));

        footerPanel.add(footerLabel);

        // ================= BUTTON ACTIONS =================

        voterButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Voter Login Page will open here."
            );
        });

        adminButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Admin Login Page will open here."
            );
        });

        registerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Voter Registration Page will open here."
            );
        });

        exitButton.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to exit?",
                    "Exit",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // ================= ADD COMPONENTS =================

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            Main homePage = new Main();
            homePage.setVisible(true);
        });
    }
}