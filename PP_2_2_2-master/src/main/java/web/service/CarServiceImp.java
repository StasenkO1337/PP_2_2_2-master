package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    public CarServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Car("лада", "Россия", 2020));
        cars.add(new Car("порш", "Не Россия", 2023));
        cars.add(new Car("ниссан", "Тоже явно не Россия", 2002));
        cars.add(new Car("камри", "и тут не Россия", 2021));
        cars.add(new Car("тойота", "япония", 1998));
    }

    @Override
    public List<Car> getCars(int quantity) {
        if (quantity < 0 || quantity >= 5) {
            return cars;
        } else {
            return cars.stream().limit(quantity).collect(Collectors.toList());
        }
    }
}
