package Collections.Collection2;

public class Generator {
    private static int counter;
    private static int id = counter++;
    private String name;
    public int getId(){
        return id;
    }

    Generator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
