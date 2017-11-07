package mySpring;



import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

public class JavaAnnot {

    private Map<Class, Class> map = new HashMap<>();


    public JavaAnnot(){
        System.out.println(InjectRandomInt.class);

        map.put(InjectRandomInt.class, InjectImpl.class);
    }

    public Class<Annot> getImpl(Class<? extends Annotation> ifc) {
        return map.get(ifc);
    }
}
