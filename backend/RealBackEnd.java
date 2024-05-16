package backend;

import java.util.ArrayList;

public class RealBackEnd extends BackEnd{
    private ArrayList<Integer> obstacles = new ArrayList<>();
    private int counterObstacles = 0; // when to have new obstacle
    private final static int  newInfoTime = 100;
    private final static int  startDistance = 6000;
    public void callNewInfo()
    {
        try
        {
            Thread.sleep(newInfoTime);
            for(int i=0; i<obstacles.size(); i++){
                obstacles.set(i, obstacles.get(i)-newInfoTime);
                if(obstacles.get(i)<=0){
                    obstacles.remove(i);
                    i--;
                }
            }
            if(counterObstacles % 10 ==0){
                obstacles.add(startDistance);
            }
            if(counterObstacles% 20 == 2){
                counterObstacles += -2 + (int) (Math.random() * 5); //slight randomness in time between new obstacles
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
