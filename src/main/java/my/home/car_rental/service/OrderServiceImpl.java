package my.home.car_rental.service;

import lombok.AllArgsConstructor;
import my.home.car_rental.entity.Car;
import my.home.car_rental.entity.Manager;
import my.home.car_rental.entity.Order;
import my.home.car_rental.entity.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final RestTemplate template;
    @Override
    public Order createOrder(long personId, long carId) {
        Order order = new Order();
        Person person = template.getForObject("http://localhost:8081/api/persons/"+personId,Person.class);
        Car car = template.getForObject("http://localhost:8082/api/cars/"+carId,Car.class);
        order.setPerson(person);
        order.setCar(car);
        order.setManager(new Manager(1,"Mike","888-58-96"));
        return order;
    }
}
