package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task {
	
	Map<Date, String>dayTask = new HashMap<Date, String>();
	
	DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
	LocalDate d1 = LocalDate.parse("2021年10月23日", f);
	
	dayTask.put(d1, "牛乳を買う");
}
