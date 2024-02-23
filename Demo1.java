interface I{
    public void m1();
    public void m2();
}

class D implements I{

    public void m1(){
        System.out.println("interface m1()");
    }

    public void m2(){
        System.out.println("interface m2()");
    }
}
class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello, Mountain"); 

        D s=new D();

        s.m1();
        s.m2();
    }
}