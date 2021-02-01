package com.spring.framwork.nointerface;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public abstract class BaseAspect implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        begin();
        try {
            if(isIntercept(method,objects)) {
                beafor();
                result = methodProxy.invokeSuper(obj, objects);
                after();
            }else{
                result = methodProxy.invokeSuper(obj, objects);
            }
        }catch (Exception e){
            error();
            throw e;
        }finally {
            end();
        }
        return result;
    }
    /**
     * 开始增强
     */
    public  void begin(){};
    /**
     * 前置增强
     */
    public void beafor(){};
    /**
     * 切入点判断
     * @param method
     * @param objects
     * @return
     */
    public boolean isIntercept(Method method, Object[] objects){
        return true;
    }
    /**
     * 异常增强
     */
    protected void error(){}
    /**
     * 后置增强
     */
    public void after(){};
    /**
     * 结束增强
     */
    public void end(){};
}
