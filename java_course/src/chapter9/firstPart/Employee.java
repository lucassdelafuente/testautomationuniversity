package chapter9.firstPart;

public class Employee extends Person {

    private String employeedId;
    private String title;

    public Employee(){
        /* Can explicitly state that by using a call to super which will call into the constructor of the superclass.
         * If we call super without anything in the parentheses, this will call the default constructor of the Person class. However,
         * if we wanted to call into any other constructors, we would just pass the required arguments.
         */
        super("lucas");
        System.out.println("In Employee default constructor.");
    }

    public String getEmployeedId() {
        return employeedId;
    }

    public void setEmployeedId(String employeedId) {
        this.employeedId = employeedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
