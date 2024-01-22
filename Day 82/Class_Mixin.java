//A mixin class is a class that provides a specific set of functionalities that can be mixed into other classes

interface Loggable{
    default void log(String message){
        System.out.print("Log:"+message);
    }
}
class mixin implements Loggable{
    void doSomething(){
        log(" Logging In");
    }
}

class Main{
    public static void main (String[] args) {
        mixin m=new mixin();
        m.doSomething();
    }
}
