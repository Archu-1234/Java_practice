interface Carrot{
    public void good();
    public void bad();
}
class  D implements Carrot{
    public void good(){
        // system.out.println("hii");
        System.out.println("hii");
    }
    public void bad(){
    //   system.out.println("hello");
    System.out.println("hello");
    
    }
}
class Demo5{
    public static void main(String[] args){
        D s=new D();
        s.good();
        s.bad();
    }
}


