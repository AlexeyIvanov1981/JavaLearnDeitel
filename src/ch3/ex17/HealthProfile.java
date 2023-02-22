package answers.ch3.ex17;

public class HealthProfile {

    private final int MAX_HEART_RATE = 220;
    private final int CURRENT_YEAR = 2023;


    private String name;
    private String surname;
    private String sex;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private int weight;


    public HealthProfile(String name, String surname, String sex, int dayOfBirth, int monthOfBirth,
                         int yearOfBirth, double height, int weight) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int numberOfYears() {
        return CURRENT_YEAR - getYearOfBirth();
    }

    public int maximumHumanHeartRate() {
        return MAX_HEART_RATE - (numberOfYears());
    }

    public int targetHumanHeartRate(){
        return maximumHumanHeartRate() * 50 / 100;
    }

    public double bodyMassIndex(){
        return getWeight() / (getHeight() * getHeight());
    }

    @Override
    public String toString() {
        return "HealthProfile{" +
                "name: '" + name + '\'' +
                ", surname: '" + surname + '\'' +
                ", date Of Birth: " + dayOfBirth +
                "/" + monthOfBirth +
                "/" + yearOfBirth +
                ", number Of Years: " + numberOfYears()+
                ", maximum Human HeartRate: " + maximumHumanHeartRate() +
                ", target Human HeartRate: " + targetHumanHeartRate() +
                ", height: " + height +
                ", weight: " + weight +
                ", BMI: " + bodyMassIndex() +
                '}';
    }
}
