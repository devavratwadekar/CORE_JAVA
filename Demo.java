// "Encapsulation" is a fundamental concept in object-oriented programming (OOP) in Java. It
// involves hiding the internal details of an object and exposing only the necessary parts to the
// outside world

class Human {

    // instance variable
    private String name;
    private int age;

    // In Java, Getters and Setters are special methods used to access and modify private variables
    // within a class. Since private variables are only accessible within the class they are declared,
    // outside classes cannot directly access them. However, by providing public getter and setter
    // methods, you can control how these variables are accessed and modified
    public String getName() {
        return name;
    }

    public void setName(String name) {  //local variable
        // In Java, the ‘this’ keyword is a reference variable that refers to the current object, meaning it
        // points to the object instance on which the method or constructor is being invoked. It can be
        // used in various ways to improve code readability and avoid naming conflicts between local
        // variables and instance variables.
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {   //local variable
        this.age = age;
    }

}

public class Demo {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Subodh");
        human.setAge(28);
        System.out.println(human.getName() + " : " + human.getAge());

    }
}

// Why Use Getters and Setters?
// • Encapsulation: Getters and setters allow you to encapsulate the data within your
//      class. This means that the internal representation of an object is hidden from the
//      outside world, and access to this data is controlled.
// • Data Protection: By using getters and setters, you can ensure that the data is only
//      accessed or modified in a controlled manner, preventing unauthorized access or
//      changes.
// • Code Maintainability: If the internal structure of the class changes, you can modify
//      the getter and setter methods without changing the code that uses the class.
