import java.util.ArrayList;
import java.util.List;

/**
 *  * Created by liangchen on 2018/6/28.
 *   */

public class HelloWorld {

    public void sayHello(){
                System.out.println("hello world !");
                    }

    public int getInt(){
        return 7;
    }
    public void throwException() throws MyException {

        MyException myException = new MyException();
        throw myException;

    }

    public int aroundException() {
        System.out.println("aroundException start");
        return 10;
    }

    public static void main(String[] args){
        HelloWorld helloWorld =new HelloWorld();
        helloWorld.sayHello();

        helloWorld.getInt();

        try {
            helloWorld.throwException();
        }
        catch (MyException e) {
            System.out.println("handled in main function");
        }

        helloWorld.aroundException();
    }
}

