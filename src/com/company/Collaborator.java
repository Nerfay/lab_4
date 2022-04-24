package com.company;


import java.time.LocalDate;

public class Collaborator {
    private String firstName;
    private String secondName;
    private String patronymic;
    private Position position;
    private int salary;
    private LocalDate dateOfBirth;

    public Collaborator(final String firstName,final String secondName,final String patronymic,final Position position,final int salary,final int YYYY,final int MM,final int DD) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.position = position;
        this.salary = salary;
        this.setDateofBirth(YYYY, MM, DD);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = Utilities.correctingFirstName(firstName);
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = Utilities.correctingSecondName(secondName);
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = Utilities.correctingPatronymic(patronymic);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = Utilities.correctingSalary(salary);
    }

    public LocalDate getDateofBirth() {
        return dateOfBirth;
    }

    public void setDateofBirth(int YYYY, int MM, int DD) {
        boolean isCorrectDateofBirth=true;
        if ((YYYY > LocalDate.now().getYear()) || (MM > 12) || (DD > 31)) isCorrectDateofBirth = false;
        if ((MM == 2) && (DD > 28)) isCorrectDateofBirth = false;
        if (((MM == 4) || (MM == 6) || (MM == 9) || (MM == 11)) && (DD > 30)) isCorrectDateofBirth = false;
        if (isCorrectDateofBirth){
            this.dateOfBirth=LocalDate.of(YYYY, MM, DD);
        }else{
            this.dateOfBirth=LocalDate.of(-1, -1, -1);
            System.out.println("Incorrect data!");
        }
    }
    public String toString(){
        return "Collaborator["+
                "FirstName=" + firstName +
                ", SecondName=" + secondName +
                ", Patronymic=" + patronymic +
                ", Salary=" + salary +
                ", DateofBirth=" + dateOfBirth +
                "]";
    }
}
