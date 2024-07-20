package SORTINGALGORITHM;

public class StarPRinting{
   static int j = 0;
   static void star(int row, int col){
    if(col == 0){
        return;
    }
    for(int i=0;i<col;i++){
        System.out.print(" * ");
    }
    System.out.println();
    star(row, col-1);
    }

    static void star1(int row, int col){
        if(col == 0){
            return;
        }
        for(int i=0;i<col;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=0;i<=j;i++){
            System.out.print(" ");
        }
        ++j;
        star1(row, col-1);
        }
        

        static int p = 0;

        static void star2(int row, int col){
            if(col == row){
                return;
            }
            for(int i=0;i<=col;i++){
                System.out.print(" * ");
            }
            System.out.println();
            star2(row, ++p);
            }
    
    static int s = 0;
            static void star3(int row, int s,int col){
                if(s == row){
                    return;
                }
                for(int i = 0;i < col;i++){
                    System.out.print(" ");
                }
                for(int i=0; i<=s; i++){
                    System.out.print(" * ");
                }
                System.out.println();
                star3(row, ++s , --col);
                }
        
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        star(row, col);
        System.out.println();// to separate both the pattern
        star1(row, col);
        System.out.println(); // because it is providing more space to the 
        star2(row, p);
        System.out.println(); // because it is used to separate both
        star3(col, s, col);
    }

    
}