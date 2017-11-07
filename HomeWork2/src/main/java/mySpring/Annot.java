package mySpring;

import java.lang.reflect.Field;

public interface Annot {
    public <T>void implementAnnot(T object, Field field);
}
