package com.BulkMailSender.Model;

import java.io.File;
import java.util.Arrays;

public class EmailDetails {

	private String from;
	private String[] to;
	private String subject;
	private String text;
	private String file;

	public EmailDetails() {
		super();
	}

	public EmailDetails(String from, String[] to, String subject, String text, String file) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.text = text;
		this.file = file;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String[] getTo() {
		return to;
	}

	public void setTo(String[] to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "EmailDetails [from=" + from + ", to=" + Arrays.toString(to) + ", subject=" + subject + ", text=" + text
				+ ", file=" + file + "]";
	}

}
