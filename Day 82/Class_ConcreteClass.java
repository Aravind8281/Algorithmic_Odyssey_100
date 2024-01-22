class Main{
    static class Concrete{
        static String name;
        static int length;
        static int breadth;
        public Concrete(String name,int length,int breadth){
            this.name=name;
            this.length=length;
            this.breadth=breadth;
        }
        public static int Area(){
            return length*breadth;
        }
    }
    public static void main (String[] args) {
        Concrete c=new Concrete("rectangle",3,2);
        System.out.print(c.Area());
    }
}
