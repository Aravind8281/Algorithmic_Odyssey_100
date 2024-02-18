import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Get class information
        Class<?> clazz = MyClass.class;

        // Get class name
        String className = clazz.getName();
        System.out.println("Class Name: " + className);

        // Get class fields
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Get class methods
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

class MyClass {
    private int myField;

    public void myMethod() {
        System.out.println("MyMethod called");
    }
}
