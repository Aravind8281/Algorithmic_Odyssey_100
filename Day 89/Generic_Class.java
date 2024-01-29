class Box<T>{
    private T content;
    public Box(T content){
        this.content=content;
    }
    public T getContent() {
        return content;
    }
}
class Main{
    public static void main (String[] args) {
        Box<Integer> inte=new Box<>(42);
        System.out.println(inte.getContent());
        Box<String> str=new Box<>("Hello");
        System.out.println(str.getContent());
    }
}
