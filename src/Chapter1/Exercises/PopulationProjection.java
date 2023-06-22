package Chapter1.Exercises;
//Exercise 1.11 (Population projection) The U.S. Census Bureau projects population based on
//the following assumptions:
//■ One birth every 7 seconds
//■ One death every 13 seconds
//■ One new immigrant every 45 seconds
//Write a program to display the population for each of the next five years. Assume
//that the current population is 312,032,486, and one year has 365 days. Hint: In Java,
//if two integers perform division, the result is an integer. The fractional part is truncated.
// For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the
// fractional part, one of the values involved in the division must be
//a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
public class PopulationProjection {
    public static void main(String[] args) {

        long population = 312032486;
        double daysPerYear = 365;
        double hoursPerDay = 24;
        double hoursPerYear = daysPerYear * hoursPerDay;
        double secondsPerDay = 60 * 60 * hoursPerDay;
        long secondsPerYear = (long) (secondsPerDay * daysPerYear);
        double secondsPerHour = 60 * 60;

        double birthPerSeconds = 7;
        double deathPerSeconds = 13;
        double immigrantsPerSeconds = 45;

        long birthPerYear = (long) (secondsPerYear / birthPerSeconds);
        long deathPerYear = (long) (secondsPerYear / deathPerSeconds);
        long immigrantsPerYear = (long) (secondsPerYear / immigrantsPerSeconds);



        //System.out.println(60 * 60 * 24);
       // System.out.println(secondsPerYear);

        //Nacimientos por año
        System.out.println(birthPerYear);

        //Población por año + el número de nacimientos:
        System.out.println("La población para el primer año es de:");
        System.out.println(population + birthPerYear);

        //Muertes por año
        System.out.println(deathPerYear);
        //Población por año - el número de muertes:
        System.out.println("La población para el primer año es de:");
        System.out.println(population - deathPerYear);

        //Inmigrantes por año
        System.out.println(immigrantsPerYear);
        //Población por año + el número de inmigrantes:
        System.out.println("La población para el primer año es de:");
        System.out.println(population + immigrantsPerYear);

    }

}
