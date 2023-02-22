package answers.сh3.ex16;

public class HeartRates {
    private String name;
    private String surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int numberOfYears() {
        int numberOfYears;
        numberOfYears = 2023 - this.yearOfBirth;
        return numberOfYears;
    }

    public int maximumHumanHeartRate() {
        int maximumHumanHeartRate;
        maximumHumanHeartRate = 220 - (numberOfYears());
        return maximumHumanHeartRate;
    }

    public int targetHumanHeartRate(){
        int targetHumanHeartRate;
        targetHumanHeartRate = maximumHumanHeartRate() * 50 / 100;
        return targetHumanHeartRate;
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", date Of Birth: " + dayOfBirth +
                "/" + monthOfBirth +
                "/" + yearOfBirth +
                ", number Of Years: " + numberOfYears()+
                ", maximum Human HeartRate: " + maximumHumanHeartRate() +
                ", target Human HeartRate: " + targetHumanHeartRate() +
                '}';
    }
}
