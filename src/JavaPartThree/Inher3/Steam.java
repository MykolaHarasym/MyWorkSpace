package JavaPartThree.Inher3;

public class Steam extends Root {
    Component1 cp1 = new Component1();
    Component2 cp2 = new Component2();
    Component3 cp3 = new Component3();

    public Steam(Component1 cp1, Component2 cp2, Component3 cp3) {
        super(cp1, cp2, cp3);

        System.out.println("Constructor Steam");
    }
}
