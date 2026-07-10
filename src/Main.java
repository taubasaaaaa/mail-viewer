import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.MailMessage;

public class Main {
	public static void main(String[] args) {
		List<MailMessage> messages = new ArrayList<>();

        messages.add(new MailMessage(
                "採用担当",
                "面接について",
                "こんにちは。面接日程をご案内します。",
                LocalDateTime.now(),
                false));

        messages.add(new MailMessage(
                "自分",
                "Re: 面接について",
                "ありがとうございます。よろしくお願いいたします。",
                LocalDateTime.now(),
                true));

        for (MailMessage mail : messages) {
            System.out.println("-------------------------");
            System.out.println(mail.getSender());
            System.out.println(mail.getDate());
            System.out.println(mail.getBody());
        }
    }
}
