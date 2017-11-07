package mySpring;

import java.lang.reflect.Field;

public interface FieldProcessing {
    <T>void proceesField(T o, Field field);

}
