package practice;

import java.util.Comparator;

public class SortByDate implements Comparator<Task> {
	 @Override
	    public int compare(Task a, Task b) {
	      return a.getDate().compareTo(b.getDate());
	    }
}
