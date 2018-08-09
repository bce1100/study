package reflect;

/**
 * @author bce1100
 * @date 2018/8/9.
 */
public class GrandFather {
    public String publicField = "g:publicField";
    String defaultField = "g:defaultField";
    protected String protectedField = "g:protectedField";
    private String privateField = "g:privateField";

    public void publicMehtod(){
        System.out.println("g:publicMethod");
    }

     void defaultMehtod(){
        System.out.println("g:defaultMehtod");
    }

    protected void protectedMehtod(){
        System.out.println("g:protectedMethod");
    }

    private void privateMehtod(){
        System.out.println("g:privateMethod");
    }

}
