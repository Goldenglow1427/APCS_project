package backend;

import java.util.ArrayList;

public class RandomBackEnd extends BackEnd
{
    private int cnt = 0;

    public void callNewInfo()
    {
        try
        {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setUpdated();
    }

    @Override
    public ArrayList<Integer> getNewArray()
    {
        this.cnt++;
        ArrayList<Integer> myAL = new ArrayList<Integer>();
        myAL.add(this.cnt);

        return myAL;
    }
}
