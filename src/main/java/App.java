import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        if (bean == beanTwo) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
        Cat beanThree = (Cat) applicationContext.getBean("cat");
        System.out.println(beanThree.getName());
        Cat beanFour = (Cat) applicationContext.getBean("cat");
        System.out.println(beanFour.getName());
        if (beanThree == beanFour) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}