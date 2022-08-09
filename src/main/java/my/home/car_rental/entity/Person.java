package my.home.car_rental.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Person {

    private long id;
    private String name;
    private String surname;
}
