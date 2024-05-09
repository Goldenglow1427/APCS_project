package BackEnd;

public interface BackEnd
{
    /**
     * Based on the current time, return an array containing all the blocks away.
     * @return An array of all the blocks away.
     */
    public int[] getPixelArray();

    /**
     * Assume the time has flied by "dt" miliseconds. Change the getPixelArray.
     * @param dt The amount of time need to be changed.
     */
    public void moveTime(int dt);
}
