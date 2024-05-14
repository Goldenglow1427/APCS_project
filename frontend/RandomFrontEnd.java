package frontend;

import backend.*;

public class RandomFrontEnd extends FrontEnd
{
    public RandomFrontEnd(BackEnd be)
    {
        super(be);
    }
    
    public void initiate()
    {
        System.out.println(2);
    }

    public void quit()
    {
        System.out.println("Ended");
    }

    public void show()
    {
        for(int i=1; i<=10; i++)
        {
            while(!myBE.waitNewInfo());
            System.out.println(myBE.getNewArray());
        }
    }
}
