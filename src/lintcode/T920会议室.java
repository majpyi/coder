package lintcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @program: coder
 * @description:
 * @author: Majpyi
 * @create: 2019-06-02 12:02
 **/
class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
	public Interval(Integer start) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval{" +
			"start=" + start +
			", end=" + end +
			'}';
	}
}

public class T920会议室 {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Write your code here
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        for (int i = 0; i < intervals.size() - 1; i++) {
            if (intervals.get(i).end > intervals.get(i + 1).start) {
                return false;
            }
        }
        return true;
    }
}
