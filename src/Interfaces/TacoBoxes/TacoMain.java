package Interfaces.TacoBoxes;
public class TacoMain {
    public static void main(String[] args) {
        TripleTacoBox tacoBox1 = new TripleTacoBox();
        tacoBox1.eat();
        System.out.println(tacoBox1.tacosRemaining());
    }
}