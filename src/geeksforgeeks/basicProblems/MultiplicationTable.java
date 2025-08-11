package geeksforgeeks.basicProblems;

public class MultiplicationTable {
    public static void main(String[] args) {

        int x= 3; // n = 1,2,3,4,5..........n
        tableOfANumber(3);
    }

    static void tableOfANumber(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n +"x" + i +"="+ (n*i) );
        }
    }
}
