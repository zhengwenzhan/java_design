package abstractDocument.domain;

import abstractDocument.Document;

import java.util.Optional;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface HasPrice extends Document {

    String PROPERTY = "price";

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(PROPERTY));
    }
}
