package cn.tedu.tickets;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//这个类用来测试 自定义注解
public class Test4_Annotation {
}
//1、自定义注解 ： @interface  注解名  --语法和Java不同
//2、@Target指定注解可以出现的位置
@Target({ ElementType.TYPE , ElementType.METHOD , ElementType.FIELD })//在类上/方法上/属性上
//3、@Retention指定注解的生命周期
@Retention(RetentionPolicy.SOURCE)
//源码文件中生效
@interface Test {
    //5、给注解加功能--属性
//    String name() ;
    String name() default "jack" ;//8、给属性富裕默认值
    String value() ;//9、特殊属性 value，特殊在使用时可以直接赋值，如：@Test("123")
}
//6、使用注解时，给name属性赋值
//@Test(name="helloTest")
@Test("123") //7、虽然有了name属性，但是我还想便捷的使用
//4、使用注解  ：  @注解名
//@Test
class HelloTest {
//    @Test 注解的位置只能用在类上,其他位置会报错
    String name;
//    @Test 注解的位置只能用在类上,其他位置会报错
    public void test() {
        System.out.println("test");
    }
}


