package view;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.MailMessage;
import model.MailThread;

public class ChatWindow extends JFrame {
	public ChatWindow(MailThread thread) {
		//window設定
		setTitle("Mail Viewer");
		setSize(400, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//threadタイトル表示
		JLabel titleLabel = new JLabel(thread.getSubject());
		titleLabel.setFont(new Font("Meiryo", Font.BOLD, 18));
		
		//message本体の表示
		JPanel messagePanel = new JPanel();
		messagePanel.setLayout(new BoxLayout(messagePanel, BoxLayout.Y_AXIS));
		
		for(MailMessage mail : thread.getMessages()) {
			JLabel label = new JLabel(mail.getBody());
			messagePanel.add(label);
		}
		
		//スクロール対応化
		JScrollPane scrollPane = new JScrollPane(messagePanel);
		
		
		//レイアウト構成
		setLayout(new BorderLayout());
		add(titleLabel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		setVisible(true);
	}
}
