package ua.com.syrovatka;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBean userBean = context.getBean("userBean", UserBean.class);
        System.out.println(userBean.getMac());
        context.close();
    }
}
