package my.home.car_rental.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Car {
    private long id;
    private String model;
    private String serial;
}
