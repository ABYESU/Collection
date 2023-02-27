package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {

	LocalDate d;
	String t;

	public Task(LocalDate day, String task) {

		// LocalDateのパターンを設定
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

		// タスクを格納する
		this.d = LocalDate.parse("day", f);
		this.t = task;
	}

	public LocalDate getDay() {
		return this.d;
	}

	@Override
	public LocalDate compareTo(Task other) {
		return;
	}
}