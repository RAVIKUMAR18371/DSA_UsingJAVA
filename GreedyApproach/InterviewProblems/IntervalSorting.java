package GreedyApproach.InterviewProblems;
import java.util.*;
import java.util.Arrays;

class Interval {
    int start;
    int end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + "]";
    }
}

public class IntervalSorting {
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>(Arrays.asList(
            new Interval(1, 2),
            new Interval(1, 4),
            new Interval(4, 6),
            new Interval(5, 7),
            new Interval(5, 6)
        ));

        // Sort intervals based on the start value
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return Integer.compare(i1.start, i2.start);
            }
        });
        int result = 0;

        // Print sorted intervals
        for (Interval interval : intervals) {
            System.out.println(interval);
        }

        // Non Overlapping Interval
        Interval endTime = intervals.get(0);
        int prevEndTime = endTime.end;

        for(int i = 1;i<intervals.size();i++){
            Interval current = intervals.get(1);
            if(current.start < prevEndTime){
                prevEndTime = Math.min(current.end , prevEndTime);
                result++;
            }
            else{
                prevEndTime = current.end;
            }
        }
        System.out.println(result);
    }
}

