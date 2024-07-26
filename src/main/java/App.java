import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        ApplicationContext applicationContext3 =
                new AnnotationConfigApplicationContext(Cat.class);
        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getVoice());

        ApplicationContext applicationContext4 =
                new AnnotationConfigApplicationContext(Cat.class);
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getVoice());

        System.out.println(bean.equals(bean2));
        System.out.println(bean3.equals(bean4));
    }
}