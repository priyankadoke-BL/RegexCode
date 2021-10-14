package RegexJava;

public class main {


        public static void main(String[] args) {
            Validation verify  = new Validation();
            System.out.println("Enter the first name");
            String fName = verify.validName();
            System.out.println("Enter the last name");
            String lName = verify.validName();
        }
    }

