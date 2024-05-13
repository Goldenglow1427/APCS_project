package frontend.images;

import backend.*;

public class RandomFrontEnd
{
    public static void main(String args[])
    {
        BackEnd myBE = new RandomBackEnd();
        for(int i=1; i<=10; i++)
        {
            while(!myBE.waitNewInfo());
            System.out.println(myBE.getNewArray());
        }
    }
}
