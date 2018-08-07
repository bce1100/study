package com.ljj.design.observer;

/**在运行时，这个客户端首先创建了具体主题类的实例，以及一个观察者对象。然后，它调用主题对象的attach()方法
 * 将这个观察者对象向主题对象登记，也就是将它加入到主题对象的聚集中去。
 * 这时，客户端调用主题的change()方法，改变了主题对象的内部状态。主题对象在状态发生变化时，调用超类
 * notifyObservers()方法，通知所有登记过的观察者对象。
 * @author bce1100
 * @date 2018/8/7.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change("dota2");
    }
}
