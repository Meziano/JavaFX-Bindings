# JavaFX-Bindings
JavaFX Properties and Bindings

This Example shows how it's simple to bind the text-property of a control (a Label for example) with the property of a simple "JavaFx-Bean".
A "javaFX-Bean" is like a JavaBean, but its fileds or property are defined as "Properties". 

Here is a simple example:

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private final StringProperty lastname = new SimpleStringProperty();
    private final StringProperty firstname = new SimpleStringProperty();
    private final DoubleProperty salary = new SimpleDoubleProperty();

    /**
     * @return the lastname property
     */
    public StringProperty lastnameProperty() {
        return lastname;
    }


    /**
     * @return the lastname as String
     */
    public String getLastname() {
        return lastname.get();
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(final String lastname) {
        this.lastname.set(lastname);
    }
    ....
}

Using JavaFX-Beans make it possible to bind the properties of a model (JavaFX-Bean)  and JavaFX-Controls, to realise (without coding) the MVC Pattern.
