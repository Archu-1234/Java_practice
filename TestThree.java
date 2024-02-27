abstract class Test{
      public abstract void m1();
}
class TestImpl extends Test{
      public  void m1(){ 
        System.out.println("TestImpl class - m1 method");
      }
}

class Demo{
    public static void main(String[] args){
        new TestImpl().m1();
    }
}
