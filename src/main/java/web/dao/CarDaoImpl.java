package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final static List<Car> data = new ArrayList<>();

    static {
        data.add(new Car("black", "kia rio", 200));
        data.add(new Car("yellow", "porsche x6", 23003));
        data.add(new Car("red", "Lada Priora", 999999));
        data.add(new Car("green", "Lada Granta", 1));
        data.add(new Car("purple", "GAZ", 919191));
    }

    @Override
    public List<Car> getCars() {
        return List.copyOf(data);
    }
}