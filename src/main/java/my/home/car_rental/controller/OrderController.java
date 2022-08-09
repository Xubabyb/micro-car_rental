package my.home.car_rental.controller;

import lombok.AllArgsConstructor;
import my.home.car_rental.entity.Order;
import my.home.car_rental.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Order getOrder(@RequestParam("personId") long personId,@RequestParam("carId") long carId){
        return service.createOrder(personId,carId);
    }
}
