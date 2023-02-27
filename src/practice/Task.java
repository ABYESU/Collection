package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {

	LocalDate d;
	String t;

	public Task(LocalDate day, String task) {

		// タスクを格納する
		this.d = day;
		this.t = task;
	}

	@Override
	public int compareTo(Task other) {
		return this.d.compareTo(other.d);
	}
}