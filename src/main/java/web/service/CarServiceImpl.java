package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(Integer count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("HUYNDAI", "SOLARIS", "RED"));
        carList.add(new Car("VAZ", "GIQULI", "BLUE"));
        carList.add(new Car("TOYOTA", "RAV4", "WHITE"));
        carList.add(new Car("RENAYLTH", "LOGAN", "BLACK"));
        carList.add(new Car("MAZDA", "CX-7", "YELLOW"));

        return carList.stream().limit(count).toList();
    }

}
