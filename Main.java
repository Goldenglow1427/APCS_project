import backend.RandomBackEnd;
import frontend.FrontEnd;
import frontend.RandomFrontEnd;

public class Main
{
    public static void main(String args[])
    {
        FrontEnd stage = new RandomFrontEnd(new backend.RealBackEnd());
        
        stage.show();
    }
}
