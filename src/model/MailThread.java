package model;

public class MailThread {
	private String subject;
	private List<String> participants;
	private List<MailMessage> messages;
	
	public void addMessage(MailMessage message) {
		messages.add(message);
	}
	
	public String getSubject() {
		return subject;
	}
	
	public List<String> getParticipants(){
		return participants;
	}
	
	public List<MailMessage> getMessages(){
		return messsages;
	}
	
	public MailThread(String subject, List<String> participants) {
		this.subject = subject;
		this.participants = participants;
		this.messages = new ArrayList<>();
	}
	
}
