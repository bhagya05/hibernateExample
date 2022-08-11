import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee")
public class Employee {

    @Id
    Integer id;
    String name;
    Integer age;
    String language;

    // Setters and Getters


    Employee()
    {

    }
    public Employee(String name, Integer age, String language,Integer id) {
        this.name = name;
        this.age = age;
        this.language = language;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
