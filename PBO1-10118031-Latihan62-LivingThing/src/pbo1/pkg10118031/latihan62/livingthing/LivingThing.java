package pbo1.pkg10118031.latihan62.livingthing;

/**
 *
 * @author Vendetta
 */
public abstract class LivingThing {

    public abstract void walk(String nama);

    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }

    public void eat(String nama) {
        System.out.println(nama + " Makan");
    }
}
