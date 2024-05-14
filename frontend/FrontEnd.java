package frontend;

import backend.BackEnd;

public abstract class FrontEnd
{
    protected BackEnd myBE;

    public FrontEnd(){}
    public FrontEnd(BackEnd backend)
    {
        this.myBE = backend;
    }

    public abstract void initiate();
    public abstract void show();
    public abstract void quit();
}
