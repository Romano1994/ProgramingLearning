package guestbook.bean;

import java.sql.Date;

public class GuestbookDTO {
	private String name;
	private String email;
	private String homepage;
	private String subject;
	private String content;
	private String logtime;
	
	
	public String getLogtime() {
		return logtime;
	}
	public void setLogtime(String logdate) {
		this.logtime = logdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
