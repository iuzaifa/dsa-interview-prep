package leetCode.easy;

public class WaterBottles_Q1518 {
    public static void main(String[] args) {

        System.out.println(numWaterBottles(25, 4));
    }


    public static int numWaterBottles(int numBottles, int numExchange) {

        int totalDrank = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrank += newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }

        return totalDrank;
    }
}
