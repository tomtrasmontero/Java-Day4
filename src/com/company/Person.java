package com.company;

public class Person {
    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mEmailAddress;

    public Person(String mName, String mAddress, String mPhoneNumber, String mEmailAddress) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
        this.mEmailAddress = mEmailAddress;
    }

//  default data
    public Person() {
        this("Person Name", "Address", "123-456-7890", "E-Mail");
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + ", Name: " + this.mName;
    }
}

class Student extends Person {
//    status should be constant
    private static String mStatus;

    public Student(String mName, String mAddress, String mPhoneNumber, String mEmailAddress, String mStatus) {
        super(mName, mAddress,mPhoneNumber,mEmailAddress);
        this.mStatus = mStatus;
    }

    public Student() {
        this("Student Name", "sAddress", "123-456-7890", "Student E-Mail",
                "Fresman");
    }
}

class Employee extends Person {
    private String mOffice;
    private int mSalary;
    private Date mDateHired;

    public Employee(String mName, String mAddress, String mPhoneNumber, String mEmailAddress, String mOffice,
                    int mSalary, Date mDateHired) {
        super(mName,mAddress,mPhoneNumber,mEmailAddress);
        this.mOffice = mOffice;
        this.mSalary = mSalary;
        this.mDateHired = mDateHired;
    }

    public Employee() {
        this("Employee Name", "eAddress", "123-456-7890", "Employee E-Mail",
                "Office", 0, new Date());
    }
}

class Faculty extends Employee {
    private String mOfficeHour;
    private String mRank;

    public Faculty(String mName, String mAddress, String mPhoneNumber, String mEmailAddress, String mOffice,
                   int mSalary, String mDatehired, String mOfficeHour, String mRank) {
        super(mName,mAddress,mPhoneNumber,mEmailAddress,mOffice,mSalary, new Date());
        this.mOfficeHour = mOfficeHour;
        this.mRank = mRank;
    }

    public Faculty() {
        this("Faculty Name", "fAddress", "123-456-7890", "Faculty Address",
                "Office", 0, "Jan 1, 2010", "9-5", "Faculty Rank");
    }
}

class Staff extends Employee {
    private String mTitle;

    public Staff(String mName, String mAddress, String mPhoneNumber, String mEmailAddress, String mOffice,
                   int mSalary, String mDatehired, String mTitle) {
        super(mName,mAddress,mPhoneNumber,mEmailAddress,mOffice,mSalary, new Date());
        this.mTitle = mTitle;
    }

    public Staff() {
        this("Staff Name", "sAddress", "123-456-7890", "Staff Address",
                "Office", 0, "Jan 1, 2010", "Staff Title");
    }
}