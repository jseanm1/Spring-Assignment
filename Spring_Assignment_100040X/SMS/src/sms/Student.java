/*
        100040X
        Arukgoda J.S.
        Programming Challenge
*/
package sms;

public class Student {
        private String firstName;
        private String lastName;
	private long regNumber;
	private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getRegNumber() {
        return regNumber;
    }



}
