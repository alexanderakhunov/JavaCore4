package Java.OtherClass;

public abstract class MyExceptionClass extends Exception{
    private final int param1;

    public int getParam1() {
        return param1;
    }

    public MyExceptionClass(String message, int param1) {
        super(message);
        this.param1 = param1;
    }
}
