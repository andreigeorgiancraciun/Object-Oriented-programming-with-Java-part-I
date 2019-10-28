
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

    private ArrayList<Grades> list;

    public List() {
        list = new ArrayList<Grades>();

    }

    public void addToList(Grades grade) {
        list.add(grade);
    }

    public void showList() {
        int[] vector = new int[6];
        double allMark = 0;
        
        for (Grades g : list) {

            if (g.getMark() > 0) {
                if (g.getMark() < 30) {
                    vector[0] = vector[0] + 1;
                    
                }
            }
            if (g.getMark() >= 30) {
                if (g.getMark() <= 34) {
                    vector[1] = vector[1] + 1;
                    
                }
            }
            if (g.getMark() >= 35) {
                if (g.getMark() <= 39) {
                    vector[2] = vector[2] + 1;
                    
                }
            }
            if (g.getMark() >= 40) {
                if (g.getMark() <= 44) {
                    vector[3] = vector[3] + 1;
                    
                }
            }
            if (g.getMark() >= 45) {
                if (g.getMark() <= 49) {
                    vector[4] = vector[4] + 1;
                    
                }
            }
            if (g.getMark() >= 50) {
                if (g.getMark() <= 60) {
                    vector[5] = vector[5] + 1;
                    
                }
            }

        }
        System.out.println("Grade distribution: ");
        for (int i = vector.length-1; i>=0; i--){
            System.out.print(i + ": ");
            for(int j = vector[i]; j>0; j--){
                System.out.print("*");
                allMark++;
            }
            System.out.println("");
        }
        
        System.out.println("Acceptance percentage: " + 100*(allMark - vector[0])/allMark);
    }

}
