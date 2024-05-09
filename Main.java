import backend.BackEnd;
import backend.RandomBackEnd;

public class Main
{
    public static void main(String args[])
    {
        BackEnd myBackEnd = new RandomBackEnd();

        System.out.println(myBackEnd.getPixelArray()[0]);
        myBackEnd.moveTime(20);
        System.out.println(myBackEnd.getPixelArray()[0]);
    }
}
