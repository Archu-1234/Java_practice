class Dog{
    String name;
    String bread;
    int cost;
}

class A {
    public static void main(String[] args) {

       Dog b =new Dog();
        System.out.println(b.name);
        System.out.println(b.bread);
        System.out.println(b.cost);
       
       b.name="smally";
       b.bread="golden retrivor";
       b.cost=50;
      
       System.out.println(b.name);
        System.out.println(b.bread);
        System.out.println(b.cost);

    }
}