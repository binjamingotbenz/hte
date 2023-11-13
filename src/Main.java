import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(260, "Mitsubishi Motors");
        Driver driver = new Driver("Белугин Степан Сергеевич", 10);
        Car car = new Car("Mitsubishi", "Седан", 780, driver, engine);
        System.out.println(car.toString());

        Lorry lorry = new Lorry("Changan", "Грузовик", 3000, driver, engine, 2000);
        System.out.println(lorry.toString());

        SportCar sportCar = new SportCar("BMW", "Купе", 900, driver, engine, 590);
        System.out.println(sportCar.toString());

        System.out.println(engine.getManufacturer());
        engine.setManufacturer("mitsubishi");
        System.out.println(engine.getManufacturer());
    }

}