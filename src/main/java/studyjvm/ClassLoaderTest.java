package studyjvm;

/**
 * Created by zhengwenzhan on 2019-05-21
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return super.loadClass(name);
            }
        };

        Object object = classLoader.loadClass("studyjvm.ClassLoaderTest").newInstance();


        System.out.println(object.getClass());

        System.out.println(object instanceof SubClass);

    }
}
