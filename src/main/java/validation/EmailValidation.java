package validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * EmailValidation
 */
public class EmailValidation {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String email = buf.readLine();
        if(new ValidationBO().validateEmail(email))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }

}
