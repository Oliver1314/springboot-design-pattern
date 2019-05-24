package oliver.proxy.dynamic;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Oliver on 2018/4/26.
 */

@Component
public class DynamicJdkProxy implements InvocationHandler {

    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.target=proxy;

        System.out.println("代理执行之前。。。。。。");

        method.invoke(target,args);

        System.out.println("代理执行之后。。。。。。");
        return null;
    }
}
