package mySpring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;


public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
           type =  config.getImpl(type);
        }
        T o = type.newInstance();

        FieldProcessing process = new JavaFieldProcessing();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            process.proceesField(o,field);
            }

        return o;
    }

}








