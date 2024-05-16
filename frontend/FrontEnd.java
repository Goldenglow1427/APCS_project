package frontend;

import backend.BackEnd;

public abstract class FrontEnd
{
    private BackEnd myBE;

    public FrontEnd(){}
    public FrontEnd(BackEnd backend)
    {
        this.myBE = backend;
    }

    protected BackEnd backend()
    {
        return this.myBE;
    }

    public abstract void initiate();
    public abstract void show();
    public abstract void quit();
}
