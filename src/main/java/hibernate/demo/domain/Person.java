package hibernate.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table()
@Data
@Setter
@NoArgsConstructor
@Getter
public class Person {
    @Id
    private int id;
    private String firstName;
    private int age;
    private String lastName;

    public Person(String firstName, int age, String lastName) {
        this.firstName = firstName;
        this.age = age;
        this.lastName = lastName;
    }
}
