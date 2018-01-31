package Collections.Collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Gerdil> gerdils = new ArrayList<>();
        for (int i = 0; i < 5; i ++){
            gerdils.add(new Gerdil(i));
        }
        Iterator<Gerdil> it = gerdils.iterator();
        while(it.hasNext()){
            Gerdil g = it.next();
            g.hop();
        }
    }
}
