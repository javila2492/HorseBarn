public class HorseBarn
{
    Horse[] spaces;
    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name)
    {
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                if (spaces[i].getName().equals(name))
                    return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        for (int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                for(int j = i; j < spaces.length; j++)
                {
                    spaces[i] = spaces[j];
                    spaces[j] = null;
                    if(spaces[i] != null)
                        break;
                }
            }
        }
    }
}
