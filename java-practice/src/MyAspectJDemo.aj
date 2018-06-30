
/**
 * Created by zejian on 2017/2/15.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * 切面类
 */
public aspect MyAspectJDemo {
    /**
     * 定义切点,日志记录切点
     */
    pointcut recordLog():call(* HelloWorld.sayHello(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut authCheck():call(* HelloWorld.sayHello(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut getExample():call(* HelloWorld.getInt(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut throwExample():call(* HelloWorld.throwException(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut aroundExample():call(* HelloWorld.aroundException(..));


    /**
     * 定义前置通知!
     */
    before():authCheck(){
        System.out.println("sayHello方法执行前验证权限");
    }

    /**
     * 定义后置通知
     */
    after():recordLog(){
        System.out.println("sayHello方法执行后记录日志");
    }

    after()returning(int x):getExample(){
        System.out.println("return x:" + x);
    }

    after()throwing(MyException e): throwExample() {
        e.printSth();
    }

    Object around(): aroundExample() {
        System.out.println("sayAround before");
        Object result=proceed();//执行目标函数
        System.out.println("sayAround after: " + result);
        return result;
    }
}
