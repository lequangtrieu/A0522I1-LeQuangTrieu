package ss20_code_fpt.Demo;

public class Lift extends Ladder{
    public final void step(){
        System.out.println("Lift");
    }
    public static void main(String [] args){
        new Lift().step();
    }
}
