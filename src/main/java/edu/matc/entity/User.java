package edu.matc.entity;
import java.time.LocalDate;
import java.sql.Date;

import static java.time.temporal.ChronoUnit.YEARS;

// TODO <done> Add instance variable for the date of birth
// TODO <done> Add a calculation for the user's age. Age should not be stored, it should be calculated only.

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private Date birthDate;


    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     */
    public User(String firstName, String lastName, String userid
            , Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.birthDate = birthDate;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets birth date.
     *
     * @return the birth date
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets birth date.
     *
     * @param birthDate the birth date
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets userid.
     *
     * @return the userid

     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * Sets userid.
     *
     * @return age the age
     */
    public long getAge() {

        LocalDate dateofBirth = birthDate.toLocalDate();
        LocalDate now = LocalDate.now();
        return dateofBirth.until(now, YEARS);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }


}