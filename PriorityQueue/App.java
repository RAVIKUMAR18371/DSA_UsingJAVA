package PriorityQueue;
import java.util.*;
public class App{
    private static class Student{
        String name;
        int rollno;
        int marks;
        String dob;
    }
    private static class studentsComparator implements Comparator<Student>{
        // overriding
        public int compare(Student s1, Student s2){
            if(s1.marks > s2.marks){
                return 1;
            }
            else if(s2.marks > s2.marks){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>();
        Student harsh = new Student();
        harsh.name = "Harsh";
        harsh.rollno = 14;
        harsh.marks = 97;
        harsh.dob = "12-10-2001";
        studentQueue.add(harsh);

        Student raghav = new Student();
        raghav.name = "raghav";
        raghav.rollno = 23;
        raghav.marks = 92;
        raghav.dob = "10-11-2001";
        studentQueue.add(raghav);







        System.out.println(studentQueue.peek());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(15);
        pq.add(20);
        pq.add(5);
        pq.add(7);
        pq.remove();

        System.out.println(pq);
        System.out.println(studentQueue);

    }
}
