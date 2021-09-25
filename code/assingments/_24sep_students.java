public class _24sep_students {

    int rollNumber;
    int standard;
    String firstName;
    String lastName;


    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setStandard(int standard){
        this.standard = standard;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void getRollNumber(){
        System.out.println("roll number : "  +rollNumber);
    }
    public void getFirstName(){
        System.out.println("first name : " + firstName);
    }
    public void getLastName(){
        System.out.println("last name : " + lastName);
    }
    public void getStandard(){
        System.out.println("standard : " + standard);
    }

    public void studentInfo(){
        System.out.println("roll number: "+ rollNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("standard: " + standard);
    }

    public _24sep_students(){
        System.out.println("class created...");
    }
    public _24sep_students(int r,String f,String l, int s){
        this.rollNumber = r;
        this.firstName = f;
        this.lastName = l;
        this.standard = s;

        System.out.println("roll number: "+ rollNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("standard: " + standard);


    }
}
