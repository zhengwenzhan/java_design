package abstractDocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by zhengwenzhan on 2019-03-13
 */
public interface Document {
    Void put(String key, Object value);

    Object get(String key);

    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
