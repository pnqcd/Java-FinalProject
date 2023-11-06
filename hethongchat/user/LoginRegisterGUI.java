import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginRegisterGUI {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginRegisterGUI() {
        // Tạo JFrame và thiết lập thuộc tính
        frame = new JFrame("Login/Register");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 3));
        frame.getContentPane().setBackground(Color.WHITE);

        // Tạo các thành phần giao diện
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Thiết lập màu sắc cho các thành phần
        usernameLabel.setForeground(Color.BLUE);
        passwordLabel.setForeground(Color.BLUE);  

        loginButton.setBorderPainted(false);     
        loginButton.setOpaque(true);
        loginButton.setBackground(Color.GREEN);
        loginButton.setPreferredSize(new Dimension(80, 40));

        registerButton.setBorderPainted(false);     
        registerButton.setOpaque(true);
        registerButton.setBackground(Color.ORANGE);

        // Thiết lập kích thước cho các thành phần
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        usernameField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));

        // Thêm các thành phần vào JFrame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(registerButton);

        // Đăng ký sự kiện cho nút Login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                // Thực hiện xử lý đăng nhập
                // ...
                JOptionPane.showMessageDialog(frame, "Logged in as " + username);
            }
        });

        // Đăng ký sự kiện cho nút Register
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                // Thực hiện xử lý đăng ký
                // ...
                JOptionPane.showMessageDialog(frame, "Registered user " + username);
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        LoginRegisterGUI gui = new LoginRegisterGUI();
        gui.show();
    }
}