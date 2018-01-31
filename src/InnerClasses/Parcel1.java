package InnerClasses;

public class Parcel1 {
    class Content{
        private int i = 11;

        public int getI() {
            return i;
        }
    }

    class Destination{
        private String label;
        Destination (String WhereTo){
            label = WhereTo;

        }

        public String getLabel(){
            return label;
        }
    }
    public void Ship(String dest){
        Content c = new Content();
        Destination d = new Destination(dest);
        System.out.println(d.getLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.Ship("Lviv");
    }
}
