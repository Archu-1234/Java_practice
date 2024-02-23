interface Dog{
    public void m1();
    public void m2();
}
class D implements Dog{

    public void m1(){
        System.out.println("m1 method");
    }

    public void m2(){
        System.out.println("m2 method");
    }
}

class Demo4{
    public static void main(String[] args){
      
      D s= new D();
       s.m1();
       s.m2();
}

}


