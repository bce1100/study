package example;

import mypackage.HelloWorld;
import mypackage.HelloWorldService;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        HelloWorldService helloWorldService = new HelloWorldService();

        HelloWorld helloWorldPort = helloWorldService.getHelloWorldPort();
        String result = helloWorldPort.sayHelloWorldFrom("19715(罗君杰)");
        System.out.println(result);
    }
}
