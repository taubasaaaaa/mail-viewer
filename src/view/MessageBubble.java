package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.MailMessage;

public class MessageBubble extends JPanel {
	public MessageBubble(MailMessage mail) {
		
		//レイアウト決定
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel senderLabel = new JLabel(mail.getSender());
		JLabel bodyLabel = new JLabel(mail.getBody());
		
		//bodyPanelの設定
		JPanel bodyPanel = new JPanel();
		bodyPanel.add(bodyLabel);
		bodyPanel.setBackground(Color.LIGHT_GRAY);
		bodyPanle.setBorder(BorderFactory.createEmptyBorder(8, 12, 8, 12));
		
		//bodyPanelの背景色設定
		if(mail.isFromMe()) {
			bodyPanel.setBackground(new Color(180, 255, 180));
		}
		else {
			//do nothing
		}
		
		//footepanelの設定
		JPanel footerPanel = new JPanel();
		footerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		String formattedDate = mail.getDate().format(formatter);
		JLabel timeLabel = new JLabel(formattedDate);
		footerPanel.add(timeLabel);
		
		
		//コンポーネントを追加
		add(senderLabel);
		add(bodyPanel);
		add(footerPanel);
		
		//余白
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		
		
	}
}
