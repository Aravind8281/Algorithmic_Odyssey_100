class Fruit{
    void print(){
        System.out.print("Hey ");
    }
}
class Apple extends Fruit{
    void print(){
        System.out.print("Message");
    }
    void print(String name){
        System.out.print(name);
    }
}
class Main{
    public static void main(String[] args){
        Apple a=new Apple();
        a.print("Aravind");
    }
}
