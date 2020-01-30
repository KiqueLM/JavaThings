package Exercises.MethodChaining;

public class Driver {

    private String firstName;
    private String lastName;
    private Integer age;
    private String car;
    private String registrationNumber;
    private String gender;

    private Driver(DriverBuilder builder) {

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.car = builder.car;
        this.registrationNumber = builder.registrationNumber;
        this.gender = builder.gender;

    }

    //GETTERS
    /* GETTERS
    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public Integer getAge() { return age; }

    public String getCar() { return car; }

    public String getRegistrationNumber() { return registrationNumber; }

    public String getGender() { return gender; }
    */

    @Override
    public String toString() {
        String driverEdad = "Driver: " + this.firstName + " " + this.lastName + ", " + this.age + " años, " + this.gender + ", " + this.car + ", " + this.registrationNumber;
        String driverEdadNull = "Driver: " + this.firstName + " " + this.lastName + ", " + this.age + ", " + this.gender + ", " + this.car + ", " + this.registrationNumber;

        String driver = (age != null) ? driverEdad : driverEdadNull;
        return driver;

        //IF TRADICIONAL
        // if (age != null) {
        //    return "Driver: " + this.firstName + " " + this.lastName + ", " + this.age + " años, " + this.gender + ", " + this.car + ", " + this.registrationNumber;
        //}else {
        //    return "Driver: " + this.firstName + " " + this.lastName + ", " + this.age + ", " + this.gender + ", " + this.car + ", " + this.registrationNumber;
        //}
    }

    public static class DriverBuilder {
        private final String firstName;
        private final String lastName;
        private Integer age;
        private String gender;
        private final String car;
        private final String registrationNumber;

        DriverBuilder(String firstName, String lastName, String car, String registrationNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.car = car;
            this.registrationNumber = registrationNumber;
        }

        DriverBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        DriverBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        Driver build() {
            //Driver driver =  new Driver(this);
            //validateUserObject(driver);
            return new Driver(this);
        }

        //private void validateUserObject(Driver driver) { }

    }

    public static void main(String[] args) {

        Driver driver1 = new DriverBuilder("Luis", "López", "Jetta", "RSA - 0134")
                .age(25)
                .gender("Masculino")
                .build();

        System.out.println(driver1);

        Driver driver2 = new Driver.DriverBuilder("María", "Rodríguez", "Versa", "SUV - 1234")
                .age(27)
                //no gender
                .build();

        System.out.println(driver2);

        Driver driver3 = new Driver.DriverBuilder("John", "Doe", "Figo", "LDK - 0987")
                //No age
                //No gender
                .build();

        System.out.println(driver3);

    }

}

