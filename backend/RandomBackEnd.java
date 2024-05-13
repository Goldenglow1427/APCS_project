package backend;

import java.util.ArrayList;

public class RandomBackEnd extends BackEnd
{
    private boolean state = false;
    private int cnt = 0;

    @Override
    public boolean waitNewInfo()
    {
        if(this.state == false)
        {
            callNewInfo();
            return false;
        }
        else
        {
            this.state = false;
            return true;
        }
    }

    public void callNewInfo()
    {
        try
        {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        this.state = true;
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