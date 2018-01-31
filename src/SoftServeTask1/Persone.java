package SoftServeTask1;

public abstract class Persone {
    private  String name;


    public Persone(String name){
        this.name = name;
    }

    public String getName() {
        return "Persone name is " + name;
    }

    public void setName(){
        this.name = name;
    }




    public abstract void showData();
}
