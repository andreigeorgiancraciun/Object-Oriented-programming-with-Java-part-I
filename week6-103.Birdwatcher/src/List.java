
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class List {

    ArrayList<Bird> list = new ArrayList<Bird>();

    public void Add(Bird bird) {

        list.add(bird);

    }

    public void Observation(String name) {
        for (Bird b : list) {
            if (b.getName().equalsIgnoreCase(name)) {
                b.increaseObservation();
            }
        }
    }

    public void Statistics() {
        for (Bird b : list) {
            System.out.println(b);
        }
    }

    public void Show(String name) {
        for (Bird b : list) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.println(b);
            }
        }

    }
}
