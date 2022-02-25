
package pkgfinal;

/**
 *
 * @author sayeem
 */
public abstract class Person {
    public String name;
    public String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    abstract void typeOfPerson();
}
