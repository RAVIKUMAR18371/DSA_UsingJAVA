package GreedyApproach.InterviewProblems;
import java.util.*;
public class verCut_horiCut {
    public static void main(String[] args) {
        int M = 6, N = 4;
        List<Integer>  X = List.of(2,1,3,1,4);// vertical cuts
        List<Integer>  Y = List.of(4,1,2);// horizontal cuts

        X.sort(Comparator.reverseOrder());
        Y.sort(Comparator.reverseOrder());
        int totalCost = 0;
        int no_Of_VerticalPiece = 1;
        int no_Of_horizontalPiece = 1;
        //no_Of_VerticalPiece--> equals to when horizontally piece cutted
        //no_Of_horizontalPiece-->equals to  when vertical piece cutted


        int i=0;
        int j=0;
        while(i < M-1 && j < N-1){
            if(X.get(i) > Y.get(j)){ // X --> bara wala list hai
                totalCost += X.get(i) * no_Of_horizontalPiece;
                no_Of_VerticalPiece++;//mtlb verically kaat rahe hai
                i++;
            }
            else{
                totalCost += Y.get(i) * no_Of_VerticalPiece;
                no_Of_horizontalPiece++;// mtlb horizontally kaat rahe hai
                j++; // or X++ 
            }

        }
        if(i < M - 1){
            totalCost += X.get(i) * no_Of_horizontalPiece;
            i++;
        }
        else if(j < N - 1){
            totalCost += Y.get(j) * no_Of_VerticalPiece;
            j++;
        }
        System.out.println(totalCost);
    }
    
}
