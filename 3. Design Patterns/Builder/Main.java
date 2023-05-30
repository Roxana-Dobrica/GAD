package DesignPatterns.Builder;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("John")
                .job("Software Engineer")
                .university("Stanford")
                .drivingLicense(true)
                .isMarried(false)
                .build();

        Person person2 = new Person.PersonBuilder("Jane")
                .job("Doctor")
                .drivingLicense(true)
                .isMarried(true)
                .build();

    }
}
