
package cavedweller;

/**
 *
 * @author constantine
 */
public class Food {
    //fields
    private String name;
    private int x, y, nourishment;
    private boolean eaten;  
    //constuctor
    public Food (String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.nourishment = 5;
            this.eaten = false;
    }
    //methods
    public void speak() {
        System.out.println("Food noises");
    }
    public String getName() {
        return name;
    }
    public void setHp(int nourishment) {
        if (nourishment >= 0 && nourishment <= 5) {
        this.nourishment = nourishment;
        }
    }

    public boolean isEaten() {
        return eaten;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public int getNourishment() {
        return nourishment;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }
}
    //accessors


    

