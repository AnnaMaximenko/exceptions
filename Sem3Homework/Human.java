public class Human {

    String surname;
    String name;
    String lastname;
    String dateOfBirthday;
    String phone;
    String sex;

    public Human() {
    }

    public Human(String surname, String name, String lastname, String dateOfBirthday, String phone, String sex) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirthday = dateOfBirthday;
        this.phone = phone;
        this.sex = sex;
    }

    public String getSurname(String[] arr) {
        String surname = arr[0];
        return surname;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + lastname + " " + dateOfBirthday + " " + phone + " " + sex;
    }

}
