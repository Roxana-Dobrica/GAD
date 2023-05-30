package DesignPatterns.Builder;


public class PersonBuilder {

    protected String name;
    protected String job;
    protected String university;
    protected boolean drivingLicense;
    protected boolean isMarried;

    public PersonBuilder(String name) {
        this.name = name;
    }

    public PersonBuilder job(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder university(String university) {
        this.university = university;
        return this;
    }

    public PersonBuilder drivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }

    public PersonBuilder isMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
