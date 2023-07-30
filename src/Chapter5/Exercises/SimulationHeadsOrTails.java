package Chapter5.Exercises;
//5.40 (Simulation: heads or tails) Write a program that simulates flipping a coin one
//million times and displays the number of heads and tails.
public class SimulationHeadsOrTails {
    public static void main(String[] args) {

        int countNumberOfHeads = 0;
        int countNumberOfTails = 0;

        for (int flipOfaCoin = 0; flipOfaCoin < 1000000; flipOfaCoin++){

            //0 = Head, 1 = Tails
            int coin = (int)(Math.random() * 2);
            if (coin == 0){
                countNumberOfHeads++;
            }
            else {
                countNumberOfTails++;
            }
        }

        System.out.println("The number of flips returned " + countNumberOfHeads + " times head and " + countNumberOfTails + " times tails");



    }
}
