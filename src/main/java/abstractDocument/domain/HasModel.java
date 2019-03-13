package abstractDocument.domain;

import abstractDocument.Document;

import java.util.Optional;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface HasModel extends Document {
    String PROPERTY = "model";

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
