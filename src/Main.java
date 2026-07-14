import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.MailMessage;
import model.MailThread;
import view.ChatWindow;

public class Main {
	public static void main(String[] args) {
		List<MailMessage> messages = new ArrayList<>();
		
		//参加者を作る
		List<String> participants = new ArrayList<>();
		participants.add("採用担当");
		participants.add("自分");
		
		//MailThreadを作る
		MailThread thread = new MailThread("面接について",participants);
        
		//MailMessageを３つ作る
		MailMessage mail1 = new MailMessage(
				"採用担当",
				"面接について",
				"こんにちは",
				LocalDateTime.now(),
				false
			);
		MailMessage mail2 = new MailMessage( 
				"自分",
				"面接について",
				"ありがとうございます。",
				LocalDateTime.now(),
				true
			);
		MailMessage mail3 = new MailMessage(
				"採用担当",
				"面接について",
				"7/20の13時からお願いします。",
				LocalDateTime.now(),
				false
			);
		
		//threadに追加
		thread.addMessage(mail1);
		thread.addMessage(mail2);
		thread.addMessage(mail3);
		
		//表示
		new ChatWindow(thread);
    }
}
