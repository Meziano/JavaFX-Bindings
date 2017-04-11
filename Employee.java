package de.meziane.javafx.stackoverflow;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private final StringProperty lastname = new SimpleStringProperty();
    private final StringProperty firstname = new SimpleStringProperty();
    private final DoubleProperty salary = new SimpleDoubleProperty();

    /**
     * @return the lastname
     */
    public StringProperty lastnameProperty() {
        return lastname;
    }

    public String getLastname() {
        return lastname.get();
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(final String lastname) {
        this.lastname.set(lastname);
    }

    /**
     * @return the firstname
     */
    public StringProperty firstnameProperty() {
        return firstname;
    }

    public String getFirstname() {
        return firstname.get();
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(final String firstname) {
        this.firstname.set(firstname);
    }

    /**
     * @return the salary
     */
    public DoubleProperty salaryProperty() {
        return salary;
    }

    public double getSalary() {
        return salary.get();
    }

    /**
     * @param firstname the firstname to set
     */
    public void setSalary(final double salary) {
        this.salary.set(salary);
    }

}
