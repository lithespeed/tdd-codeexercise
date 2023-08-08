package main.com.greeter;

public class Greeter {

    private TimeOfDay timeOfDay;

    public String getMessage(String name) {
        return String.format("%s, %s.", getTimeOfDayString(), name);
    }

    private String getTimeOfDayString() {
        if (getTimeOfDay() == null) {
            return "Hello";
        }
        int timeOfDay = getTimeOfDay().getMilitaryTime();
        if (timeOfDay < 1200) {
            return "Good Morning";
        }
        if (timeOfDay < 1700) {
            return "Good Afternoon";
        }
        if (timeOfDay < 2000) {
            return "Good Evening";
        }
        return "Good Night";
    }

    public void setTimeOfDay(TimeOfDay timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public TimeOfDay getTimeOfDay() {
        return timeOfDay;
    }
}
