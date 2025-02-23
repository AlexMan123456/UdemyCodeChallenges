package objectOrientedProgrammingPartOne;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // GETTERS
    public int getAge() {
        return this.age;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }


    // SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }


    // EXTRA METHODS
    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }

    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        }
        if(this.firstName.isEmpty()){
            return this.lastName;
        }
        if(this.lastName.isEmpty()){
            return this.firstName;
        }
        return String.format("%s %s", firstName, lastName);
    }
}
