package backend;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

public class RealBackEnd extends BackEnd {
    private ArrayList<Integer> obstacles = new ArrayList<>(Arrays.asList(0)); //first element is dino height
    private int counterObstacles = 0; // when to have new obstacle
    private final static int  newInfoTime = 100;
    private final static int  startDistance = 3300;
    private boolean jumping = false;
    public void callNewInfo()
    {
        try
        {
            Thread.sleep(newInfoTime);
            for(int i=1; i<obstacles.size(); i++){
                obstacles.set(i, obstacles.get(i)-newInfoTime);
                if(obstacles.get(i)<=0){
                    obstacles.remove(i);
                    i--;
                }
            }
            if(counterObstacles % 15 ==0){
                obstacles.add(startDistance);
            }
            if(counterObstacles% 30 == 5){
                counterObstacles += -3 + (int) (Math.random() * 11); //slight randomness in time between new obstacles
            }
            if(obstacles.get(0)==0){
                System.out.println("rip");
            }
            counterObstacles++;
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setUpdated();
    }


    @Override
    public ArrayList<Integer> getNewArray()
    {
        return obstacles;
    }


}
