/**
 * Created by liangchen on 2018/6/5.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Java program to demonstrate how failure of static initialization subsequently cause
 * java.lang.NoClassDefFoundError in Java.
 * @author Javin Paul
 */
 class NoClassDefFoundErrorDueToStaticInitFailure {

    public static void main(String args[]){

        List<User> users = new ArrayList<User>(2);

        for(int i=0; i<2; i++){
            try{
                users.add(new User(String.valueOf(i))); //will throw NoClassDefFoundError
            }catch(Throwable t){
                t.printStackTrace();
            }
        }
    }
}

class User{
    private static String USER_ID = getUserId();

    public User(String id){
        System.out.printf("construct");
        this.USER_ID = id;
    }
    private static String getUserId() {
        System.out.printf("getUSerId");
        throw new RuntimeException("UserId Not found");
    }
}