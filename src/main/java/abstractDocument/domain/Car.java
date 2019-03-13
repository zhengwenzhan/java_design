package abstractDocument.domain;

import abstractDocument.AbstractDocument;

import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {

    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
