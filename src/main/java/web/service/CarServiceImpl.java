package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("HUYNDAI", "SOLARIS","2022"));
        carList.add(new Car("VAZ", "GIQULI","2001"));
        carList.add(new Car("TOYOTA", "RAV4","2020"));
        carList.add(new Car("RENAYLTH", "LOGAN","2019"));
        carList.add(new Car("MAZDA", "CX-7","2018"));
        if (count >= 5) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
