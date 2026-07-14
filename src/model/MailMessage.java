package model;

import java.time.LocalDateTime;


public class MailMessage {
	private String sender;
    private String subject;
    private String body;
    private LocalDateTime date;
    private boolean fromMe;

    public MailMessage(String sender, String subject, String body, LocalDateTime date, boolean fromMe) {
        this.sender = sender;
        this.subject = subject;
        this.body = body;
        this.date = date;
        this.fromMe = fromMe;
    }

    public String getSender() {
        return sender;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public boolean isFromMe() {
        return fromMe;
    }
}
