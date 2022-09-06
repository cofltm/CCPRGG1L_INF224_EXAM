public class App {
    public static void main(String[] args) {

        student me = new student();

        me.surname = "Sarmiento";
        me.firstname = "Cherish";
        me.middleinitial = 'L';
        me.dateOfBirth = "04/14/2004";
        me.studentNumber = 2022100641;
        me.studentEmailAddress = "sarmientocl@students.national-u.edu.ph";
        me.iAmAwesome = true;

        me.sayMyStudentNumber();
        me.sayMyEmailAddress();
        me.amIAwesome();

    }
}
