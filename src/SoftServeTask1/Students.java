package SoftServeTask1;

public class Students extends Persone{
    private String education;

    public Students(String education, String name){
        super(name);
        this.education = education;

    }

    public void getEducation() {

        System.out.println("Student education is " + education);
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showData() {
        System.out.println(getName());
        getEducation();

    }
}
