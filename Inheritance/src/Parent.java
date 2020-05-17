class Parent {
    public String getSurname() {
        return surname;
    }



    public Parent(String surname) {
        this.surname = surname;
    }

    protected String surname;
}

class Child extends Parent {
    public Child(String surname) {
        super(surname);
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Child ch = new Child("Ngombi");
        ch.setFirstName("Samuel");
        System.out.println(ch.getFirstName());
        ch.setLastName("Musyoka");
        System.out.println(ch.getLastName());
        //ch.setSurname("Ngombi");
        System.out.println(ch.getSurname());
    }
}
