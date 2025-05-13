package character;

public class Player {

    private int health;
    private char mesh;
    private String name;
    private Status status;
    
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }

    public void setMesh(char mesh) {
        this.mesh = mesh;
    }
    public char getMesh() {
        return mesh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    public Player(String name)
    {
        this.health = 100;
        this.mesh = '@';
        this.name = name;
    }


}