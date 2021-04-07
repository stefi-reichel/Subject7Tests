package basePackage;

public class HookInt extends Base {

    public static void platform(){
        setUp();
        waiter();
        baseClassPassed();
    }

     public static void closeApp(){
        closeAppBase();
    }

     public static void closeDriver(){
         closeDriverBase();
    }

}
