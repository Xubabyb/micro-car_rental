package my.home.car_rental.service;

import my.home.car_rental.entity.Order;

public interface OrderService {

    Order createOrder(long personId,long carId);
}
