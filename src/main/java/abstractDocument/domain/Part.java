package abstractDocument.domain;

import abstractDocument.AbstractDocument;

import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public class Part extends AbstractDocument implements HasType, HasModel, HasPrice {
    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
