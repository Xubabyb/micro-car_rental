package my.home.car_rental.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Manager {
    private long id;
    private String name;
    private String phoneNumber;
}
