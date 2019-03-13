package abstractDocument;

import abstractDocument.domain.*;

import static util.PrintUtil.nyPrint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public class App {
    public App() {
        System.out.println("Constructing parts and car");

        Map<String, Object> carProperties = new HashMap<>();
        carProperties.put(HasModel.PROPERTY, "300SL");
        carProperties.put(HasPrice.PROPERTY, 10000L);

        Map<String, Object> wheelProperties = new HashMap<>();
        wheelProperties.put(HasType.PROPERTY, "wheel");
        wheelProperties.put(HasModel.PROPERTY, "15C");
        wheelProperties.put(HasPrice.PROPERTY, 100L);

        Map<String, Object> doorProperties = new HashMap<>();
        doorProperties.put(HasType.PROPERTY, "door");
        doorProperties.put(HasModel.PROPERTY, "Lambo");
        doorProperties.put(HasPrice.PROPERTY, 300L);

        carProperties.put(HasParts.PROPERTY, Arrays.asList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);

        nyPrint("Here is out car:");
        nyPrint("-> model: " + car.getModel().get());
        System.out.println("-> price: " + car.getPrice().get());
        System.out.println("-> parts: ");

        car.getParts().forEach(p -> System.out
                .println("\t" + p.getType().get() + "/" + p.getModel().get() + "/" + p.getPrice().get()));

    }

    public static void main(String[] args) {
        new App();
    }
}
