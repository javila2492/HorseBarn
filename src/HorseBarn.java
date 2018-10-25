public class HorseBarn{
    private Horse[] spaces;
    public int findHorseSpace(String name)
    {
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i].equals(name))
                return i;
        }
        return -1;
    }
    public void consolidate()
    {

    }
}
