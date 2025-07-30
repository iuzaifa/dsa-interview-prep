package freeStyleCode;

public class AgeToVote {
    public static void main(String[] args) {


        System.out.println(isCanVoteOrNot(18));
    }


    public static boolean isCanVoteOrNot(int age){

        if (age >= 18 ){
            return true;
        }else {
            return false;
        }
    }
}
