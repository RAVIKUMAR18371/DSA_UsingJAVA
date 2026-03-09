package GreedyApproach;

import java.util.*;
 
class Meeting implements Comparable<Meeting> {
    int start;
    int end;
    int index;  // Added index to track the meeting number
 
    Meeting(int start, int end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }
 
    @Override
    public int compareTo(Meeting other) {
        return Integer.compare(this.end, other.end);
    }
}
 
public class meeting{
    public static void printMaxMeetings(List<Meeting> meetings) {
        // Sort the meetings based on their finish time 
        Collections.sort(meetings);
 
        List<Integer> selectedMeetings = new ArrayList<>();  // Track the selected meetings
 
        int count = 1;  // First meeting always gets accommodated
        int endTime = meetings.get(0).end;
        selectedMeetings.add(meetings.get(0).index);  // Add the index of the first meeting
 
        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i).start > endTime) {
                count++;
                endTime = meetings.get(i).end;
                selectedMeetings.add(meetings.get(i).index);  // Add the index of the selected meeting
            }
        }
 
        // Print the maximum number of meetings and their meeting numbers
        System.out.println("\nThe maximum number of meetings that can be accommodated is: " + count);
        System.out.print("Meeting numbers: ");
        for (int i = 0; i < selectedMeetings.size(); i++) {
            System.out.print(selectedMeetings.get(i) + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of meetings: ");
        int n = scanner.nextInt();
 
        List<Meeting> meetings = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the start time of meeting " + (i + 1) + ": ");
            int start = scanner.nextInt();
            System.out.print("Enter the end time of meeting " + (i + 1) + ": ");
            int end = scanner.nextInt();
            meetings.add(new Meeting(start, end, i + 1));
        }
 
        printMaxMeetings(meetings);
 
        scanner.close();
    }
}