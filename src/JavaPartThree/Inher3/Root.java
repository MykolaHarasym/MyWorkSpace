package JavaPartThree.Inher3;

public class Root {
    Component1 cp1 = new Component1();
    Component2 cp2 = new Component2();
    Component3 cp3 = new Component3();

    public Root(Component1 cp1, Component2 cp2, Component3 cp3) {
        this.cp1 = cp1;
        this.cp2 = cp2;
        this.cp3 = cp3;
        System.out.println("Contructor root");
    }
}
