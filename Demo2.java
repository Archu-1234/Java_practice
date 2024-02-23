interface Archana{
    public void archu();
    public void student();

} 
class D implements Archana{
    public void archu(){
        System.out.println("Archana is good girl");
    
    } 
    public void student(){
        System.out.println("she is cute girl");
    }
}

class Demo2{

    public static void main (String[] args){
        D s=new D();

        s.archu();
        s.student();

    }
}