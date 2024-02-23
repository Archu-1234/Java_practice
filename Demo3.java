interface Flower{
    public void small();
    public void big();

} 
class D implements Flower{
    public void small(){
        System.out.println("it is a small flower");
    
    } 
    public void big(){
        System.out.println("it is a big flower");
    }
}

class Demo3{

    public static void main (String[] args){
        D s=new D();

        s.small();
        s.big();

    }
}