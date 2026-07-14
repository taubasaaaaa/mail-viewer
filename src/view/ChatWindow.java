package view;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MailThread;

public class ChatWindow extends JFrame {
	public ChatWindow(MailThread thread) {
		//window設定
		setTitle("Mail Viewer");
		setSize(400, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JLabel titleLabel = new JLabel(thread.getSubject());
		titleLabel.setFont(new Font("Meiryo", Font.Bold, 18));
		
		JPanel messagePanel = new JPanel();
	}
}
