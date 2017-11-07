package mySpring;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectImpl implements Annot {

    private static Random random = new Random();
    @SneakyThrows
    @Override
    public <T> void implementAnnot(T object, Field field) {
        InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
        if(annotation != null) {
            int min = annotation.min();
            int max = annotation.max();
            int randomIntValue = random.nextInt(max - min) + min;
            field.setAccessible(true);
            field.set(object, randomIntValue);
        }
    }
}
