package backend;

import java.util.ArrayList;

public abstract class BackEnd
{
    private boolean state = false;
    
    // If the information stored is updated.
    public boolean waitNewInfo()
    {
        if(this.state == false)
        {
            this.callNewInfo();
            return false;
        }
        else
        {
            this.state = false;
            return true;
        }
    }

    // Get the updated version of the array.
    public abstract ArrayList<Integer> getNewArray();

    // Try to retrieve new information.
    public abstract void callNewInfo();
}
