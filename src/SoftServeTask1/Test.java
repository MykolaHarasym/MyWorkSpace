package SoftServeTask1;

public class Test {
    public static void main(String[] args) {
        Persone person [] = new Persone[3];
        person[0] = new Students("LNU" , "Max");
        person[1] = new Worker("SoftServe", "Jeny");
        person[2] = new Students("Politeh", "Olya");

        showAll(person);
    }

    public static  void showAll(Persone person[]){
        for (Persone p: person){
            p.showData();
        }
    }
}