
package cavedweller;

/**
 *
 * @author constantine
 */
public class Caveman {
   //Fields - insance variables
    private String name;
    private int x, y, hp;
    private boolean hasKey;
    //Constructor
    public Caveman (String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.hp = 100;
        this.hasKey = false;
    }

    
    //methods
    public void speak() {
    System.out.println("Ugh");
    }
    public String toStrig() {
        return "x: "+x+", y: "+y;
    }
    public void moveUp() {
        y -= 1;
    }
    public void moveDown() {
        y += 1;
    }
    public void eat(Food food) {
        this.hp +=food.getNourishment();
        food.setEaten(true);
        System.out.println("Me eat "+food.getName());
    }
    public void moveRight() {
        x += 1;
    }
    public void moveLeft() {
        x -= 1;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        if (hp >= 0 && hp <= 100) {
        this.hp = hp;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isHasKey() {
        return hasKey;
    }
}
     //Accessors - getters and setters