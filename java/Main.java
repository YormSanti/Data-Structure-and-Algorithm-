

public class Main {
    int x = 10;
    public static void main(String[] args) {
        Main j = new Main();
        j.x = 200;
        System.out.println(j.x);
        Car k = new Car();
        k.branc();
            
    }
}

class Car{
   
    public void branc(){
        System.out.println("Toyota");
    }
}