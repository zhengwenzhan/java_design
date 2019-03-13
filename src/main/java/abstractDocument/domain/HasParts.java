package abstractDocument.domain;

import abstractDocument.Document;

import java.util.stream.Stream;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface HasParts extends Document {
    String PROPERTY = "parts";

    default Stream<Part> getParts() {
        return children(PROPERTY, Part::new);
    }
}
