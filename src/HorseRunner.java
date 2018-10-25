public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail", 22000);
        Horse horse3 = new Mustang("Silver", 12000);

        Horse[] horses = new Horse[6];
        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        for(int i = 0; i < barn.spaces.length; i++ )
        {
            if(i == 0)
                System.out.println("Barn: ");
            if(barn.spaces[i] == null)
                System.out.println("Empty");
            else
                System.out.println("Name: " + barn.spaces[i].getName() + ", Weight: " + barn.spaces[i].getWeight());
            if(i == barn.spaces.length - 1)
                System.out.println("End of Barn");
        }
        System.out.println("Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        for(int i = 0; i < barn.spaces.length; i++ )
        {
            if(i == 0)
                System.out.println("Barn: ");
            if(barn.spaces[i] == null)
                System.out.println("Empty");
            else
                System.out.println("Name: " + barn.spaces[i].getName() + ", Weight: " + barn.spaces[i].getWeight());
            if(i == barn.spaces.length - 1)
                System.out.println("End of Barn");
        }
        System.out.println("Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));
    }
}


