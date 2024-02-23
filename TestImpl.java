interface TestI{
     public  void m1();
     abstract void m2();
     
}
class TestImpl implements TestI{
     public void m1(){
          System.out.println("TestImpl class -m1 method");
     }
     public void m2(){
          System.out.println("TestImpl class -m2 method");
     }

     public static void main(String[] args){
         TestImpl t1=new TestImpl();
         t1.m1();
         t1.m2();
     }
}