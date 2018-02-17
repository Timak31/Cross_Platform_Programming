/**
 * Варіант 11

 Розробити dll-біліотеку, яка включає в себе інтерфейс IHuman, що містить методи та властивості, які дозволяють реалізувати поведінку та
 властивості людини (вік, стать, зріст, вага, національності, віросповідання, дата народження, паспортні дані).

 Біліотека повинна також містити класи Студент (з властивостями номер залікової книжки і група) та Працівник (з властивостями назва
 підрозділу і посада), які реалізують розроблений інтерфейс.

 Розробити невелику програму, яка використовує класи із даної dll-біліотеки.

 */

public class Student implements IHuman {
    private int numberBook;
    private String group;

    private int age;
    private boolean gender;
    private int heigth;
    private double weigth;
    private String national;
    private String belief;
    private String dateOfBorn;
    private String passportSeries;
    private int passportNumber;

    public Student() {}

    public Student(int numberBook, String group, int age, boolean gender, int heigth, double weigth, String national, String belief, String dateOfBorn, String passportSeries, int passportNumber) {
        this.numberBook = numberBook;
        this.group = group;
        this.age = age;
        this.gender = gender;
        this.heigth = heigth;
        this.weigth = weigth;
        this.national = national;
        this.belief = belief;
        this.dateOfBorn = dateOfBorn;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public void setNumberBook(int numberBook) {
        this.numberBook = numberBook;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setBelief(String belief) {
        this.belief = belief;
    }

    public void setDateOfBorn(String dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getNumberBook() {
        return numberBook;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWeigth() {
        return weigth;
    }

    public String getNational() {
        return national;
    }

    public String getBelief() {
        return belief;
    }

    public String getDateOfBorn() {
        return dateOfBorn;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    @Override
    public String sayAge() {
        return "мені " + this.age + " років";
    }

    @Override
    public String manOrWoman() {
        if (gender) {
            return "Я чоловік";
        } else {
            return "Я жінка";
        }
    }

    @Override
    public String sayHeigth() {
        return "зріст " + heigth + "см";
    }

    @Override
    public String sayWeigth() {
        return "важу " + weigth + "кг";
    }

    @Override
    public String sayNational() {
        return national;
    }

    @Override
    public String sayYourBelief() {
        return "моє віросповідання - " + belief;
    }

    @Override
    public String sayDateOfBorn() {
        return "народився " + dateOfBorn;
    }

    @Override
    public String sayYourPassportDate() {
        return "серія та номер мого паспорту: " + passportSeries + " " + passportNumber;
    }

    @Override
    public String toString() {
        return manOrWoman() + ", " + sayAge() + ", " + sayHeigth() + ", " + sayWeigth() + ", " + sayDateOfBorn() + ", " + sayNational()
                + ", " + sayYourBelief() + ", " + sayYourPassportDate() + ". \nНа даний момент навчаюся в університеті, у " + group
                + " групі, залікова книжка під номером " + numberBook + ".";
    }
}
