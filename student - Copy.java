public class student {

    String surname;
    String firstname;
    char middleinitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber(){
        System.out.println("Student Number "+studentNumber);
    }

    public void sayMyEmailAddress(){
        System.out.println("Email Address "+studentEmailAddress);
    }

    public void sayIAwesome(){
        System.out.println("Am I Awesome "+iAmAwesome);
    }

}
