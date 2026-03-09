package Array;

public class minimumBorrow {
    public static void main(String[] args) {
        int saved = 0;
        int  borrow = 0;
        int N = 3;
        int[] Earn = {5, 8, 3, 7};
        int[] Cost = {6, 5, 4, 9};

        for(int i=0;i<N;i++){
            if(Earn[i] >= Cost[i]){
                saved = saved + Earn[i]-Cost[i];
            }else{
                borrow = borrow + Cost[i] - Earn[i];
            }
        }
        if(saved > borrow){
        System.out.println("The money he needs to take from his parent: "+(saved - borrow));
        }
        else if(saved < borrow){
            System.out.println("The money he needs to take from his parent: "+(borrow-saved));
        }
        else{
            System.out.println("The money he needs to take from his parent: "+ 0);
        }
    }
    
}
