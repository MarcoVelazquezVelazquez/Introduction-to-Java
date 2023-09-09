package Chapter10.Exercises;

import java.util.Date;

//*10.1 (The Time class) Design a class named Time. The class contains:
//■ The data fields hour, minute, and second that represent a time.
//■ A no-arg constructor that creates a Time object for the current time. (The
//values of the data fields will represent the current time.)
//A constructor that constructs a Time object with a specified elapsed time
//since midnight, January 1, 1970, in milliseconds. (The values of the data
//fields will represent this time.)
//■ A constructor that constructs a Time object with the specified hour, minute,
//and second.
//■ Three getter methods for the data fields hour, minute, and second,
//respectively.
//■ A method named setTime(long elapseTime) that sets a new time for the
//object using the elapsed time. For example, if the elapsed time is 555550000
//milliseconds, the hour is 10, the minute is 19, and the second is 10.
//Draw the UML diagram for the class then implement the class. Write a
//test program that creates three Time objects (using new Time(), new
//Time(555550000), and new Time(5, 23, 55)) and displays their hour,
//minute, and second in the format hour:minute:second.
//(Hint: The first two constructors will extract the hour, minute, and second
//from the elapsed time. For the no-arg constructor, the current time can be
//obtained using System.currentTimeMillis(), as shown in Listing 2.7,
//ShowCurrentTime.java. Assume the time is in GMT.)
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        Date currentTime = new Date();
        this.hour = currentTime.getHours();
        this.minute = currentTime.getMinutes();
        this.second = currentTime.getSeconds();
    }

    public Time(long elapsedTime) {
        this.hour = (int) (elapsedTime / 3_600_000) % 24;
        this.minute = (int) (elapsedTime / 60_000) % 60;
        this.second = (int) (elapsedTime / 1_000) % 60;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        this.hour = (int) (elapsedTime / 3600000) % 24;
        this.minute = (int) (elapsedTime / 60000) % 60;
        this.second = (int) (elapsedTime / 1000) % 60;
    }

    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println("Current Time: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("Elapsed Time: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("Specified Time: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());


    }

}
