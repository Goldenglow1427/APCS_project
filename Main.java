import backend.RandomBackEnd;

import frontend.FrontEnd;
import frontend.RandomFrontEnd;

public class Main
{
    public static void main(String args[])
    {
        FrontEnd stage = new RandomFrontEnd(new RandomBackEnd());
        
        stage.show();
    }
}
