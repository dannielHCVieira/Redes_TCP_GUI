import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainChat extends JFrame {
    private JTextField tfMensagem;
    private JButton enviarButton;
    private JTextArea taChat;
    private JPanel mainPanel;


    public MainChat() {
        setContentPane(mainPanel);
        setTitle("Chat");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pegar mensagem vindo do back
                taChat.append(tfMensagem.getText());
                taChat.append("\n");
            }
        });
    }

    public static void main(String[] args) {
        MainChat myChat = new MainChat();
    }

}
