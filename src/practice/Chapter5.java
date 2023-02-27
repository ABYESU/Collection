package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {

		//日付のフォーマットを作成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		//LocalDateの変数にそれぞれの日程を入れる
		LocalDate task1 = LocalDate.parse("2021年10月21日");
		LocalDate task2 = LocalDate.parse("2021年9月15日");
		LocalDate task3 = LocalDate.parse("2021年12月4日");
		LocalDate task4 = LocalDate.parse("2021年8月10日");
		LocalDate task5 = LocalDate.parse("2021年11月9日 ");
		
		//LocalDateの変数を使ってインスタンスを生成
		Task dayTask1 = new Task(task1, "牛乳を買う。");
		Task dayTask2 = new Task(task2, "〇〇社面談。");
		Task dayTask3 = new Task(task3, "手帳を買う");
		Task dayTask4 = new Task(task4, "散髪に行く。");
		Task dayTask5 = new Task(task5, "スクールの課題を解く。");
		
		List<Task> taskList = new ArrayList<>();
		
		taskList.add(dayTask1);
		taskList.add(dayTask2);
		taskList.add(dayTask3);
		taskList.add(dayTask4);
		taskList.add(dayTask5);
		
	}
}
