package reflect;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class MyReflect {
    public static void main(String[] args) {
        Son son = new Son();
        Map fieldMap = getField(son, "defaultField");
        if (fieldMap.size() > 0 && fieldMap != null) {
            for (Object s : fieldMap.keySet()) {
                System.out.println(s.toString() + ":" + fieldMap.get(s.toString()));
            }
        } else {
            System.out.println("冇哩个字段喔");
        }
    }


    public static Map getField(Object obj, String fieldName) {
        Map<String, String> fieldMap = new HashMap<>(16);
        iterateFiled(obj, obj.getClass(), fieldName, fieldMap);
        return fieldMap;
    }

    public static void iterateFiled(Object obj, Class cla, String fieldName, Map<String, String> fieldMap) {
        Field[] fields = cla.getDeclaredFields();
        for (Field field : fields) {
            if (fieldName.equals(field.getName())) {
                try {
                    field.setAccessible(true);
                    Object filedValue = field.get(obj);
                    fieldMap.put(cla.getName() + "=>" + field.getName(),
                            filedValue.toString());
                    break;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        if (cla.getSuperclass() != null) {
            iterateFiled(obj, cla.getSuperclass(), fieldName, fieldMap);
        }
    }
}
