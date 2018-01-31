package SoftServeTask1;

public class Worker extends Persone{
    private  String workPlace;
    public Worker(String workPlace, String name){
        super(name);
        this.workPlace = workPlace;

    }

    public void  getWorkPlace() {

        System.out.println("Worker workplace is " + workPlace);
    }


    @Override
    public void showData() {
        System.out.println(getName());
        getWorkPlace();
    }
}
