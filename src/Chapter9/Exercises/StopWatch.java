package Chapter9.Exercises;

import java.util.Date;

//*9.6 (Stopwatch) Design a class named StopWatch. The class contains:
//■ Private data fields startTime and endTime with getter methods.
//■ A no-arg constructor that initializes startTime with the current time.
//■ A method named start() that resets the startTime to the current time.
//■ A method named stop() that sets the endTime to the current time.
//■ A method named getElapsedTime() that returns the elapsed time for the
//stopwatch in milliseconds.
// Draw the UML diagram for the class then implement the class. Write a test program
//that measures the execution time of sorting 100,000 numbers using selection sort.
public class StopWatch {
    long startTime = System.currentTimeMillis();
    long endTime = startTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    //Método selection sort

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {

        int size = 100_000;

        double[] list = new double[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(list);
        stopWatch.stop();

        System.out.println("The sort time is " + stopWatch.getElapsedTime());
    }
}
