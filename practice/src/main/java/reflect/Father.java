package reflect;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class Father extends GrandFather {
    public String publicField = "f:publicField";

    protected String fatherJob="hand";

    @Override
    public void publicMehtod() {
        System.out.println("f:publicMethod");
    }
}
