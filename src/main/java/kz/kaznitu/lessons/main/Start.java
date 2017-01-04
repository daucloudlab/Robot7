package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml") ;

        Robot terminator = (Robot)context.getBean("t1000") ;
        terminator.action();

    }
}
