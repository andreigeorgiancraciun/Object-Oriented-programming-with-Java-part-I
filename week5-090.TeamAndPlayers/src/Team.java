
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
public class Team {

    private String team;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;

    public Team(String team) {
        this.team = team;
        maxSize = 16;
    }

    public String getName() {
        return this.team;
    }

    public void addPlayer(Player player) {
        if (this.players.size() < maxSize) {
            this.players.add(player);
            
        }
    }

    public void printPlayers() {
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;

    }

    public int size() {
        return this.players.size();
    }
    
    public int goals(){
        int sum = 0; 
        for (Player player : this.players) {
                sum = sum + player.goals();
            }
        return sum; 
    }

}
