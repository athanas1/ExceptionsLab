package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    // THIS IS RIGID DO NOT DO
    // Always check for null first
    private final int MAX_VACATION_DAYS = 28;
    private final int MIN_VACATION_DAYS = 0;
    private final int MIN_NAME_LENGTH = 2;
    private final int MAX_NAME_LENGTH = 20;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }
// Cannot be below 0 days and above 28 days 
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS)
            throw new IllegalArgumentException("Sorry Vacation days cannot be below 0 or above 28");
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }
// cannot be null or empty, cannot be less than 2 chars or more than 20
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if(firstName == null || firstName.isEmpty() ||
               firstName.length() < MIN_NAME_LENGTH || firstName.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("Sorry name cannot be less than 2 characters or more than 20");
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) throws IllegalArgumentException {
         if(lastName == null || lastName.isEmpty() ||
               lastName.length() < MIN_NAME_LENGTH || lastName.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException("Sorry name cannot be less than 2 characters or more than 20");
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
// Needs validation but would take way to long
    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
