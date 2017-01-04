package kz.kaznitu.lessons.main;


import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionReplacer implements MethodReplacer{
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("New Action method");
        return null;
    }
}
