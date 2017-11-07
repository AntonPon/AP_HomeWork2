package mySpring;

import aop_example.Conf;
import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class JavaFieldProcessing implements FieldProcessing {

    private JavaAnnot config = new JavaAnnot();
    @SneakyThrows
    @Override
    public <T> void proceesField(T o, Field field) {
        Annotation[] annotations = field.getAnnotations();
        for (Annotation annot: annotations){

// cannot can we can we get class from method getClass and Object.class????
            //Class<Annot> an = config.getImpl(annot.getClass());
            Class<Annot> an = config.getImpl(annot.annotationType());
            if (an != null){
                Annot gAnot = an.newInstance();
                gAnot.implementAnnot(o, field);
            }
        }
    }
}
