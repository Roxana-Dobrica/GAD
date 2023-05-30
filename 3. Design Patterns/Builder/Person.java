package DesignPatterns.Builder;

public class Person {

    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMarried;

    public Person(PersonBuilder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", job=" + job + ", university=" + university + ", drivingLicense=" + drivingLicense + ", isMarried=" + isMarried + '}';
    }

}
