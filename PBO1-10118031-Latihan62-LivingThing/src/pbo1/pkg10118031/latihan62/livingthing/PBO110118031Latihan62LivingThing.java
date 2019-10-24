
package pbo1.pkg10118031.latihan62.livingthing;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk membuat tampilan override abstract.
 */
public class PBO110118031Latihan62LivingThing {

    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Rizki Aria Putra");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }

}
