package my.home.car_rental.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private Person person;
    private Car car;
    private Manager manager;

}
