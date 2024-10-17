package practice;

import java.time.LocalDate;

public class Task {
	// 日付
	private LocalDate date;
	// タスク内容
	private String content;

	public Task(LocalDate date, String content) {
		this.date = date;
		this.content = content;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}
}