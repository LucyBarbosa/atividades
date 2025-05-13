package globals;

public class RenderMachine
{

    public void renderLevel(char[][] lv, int column, int rows, String name)
    {
        clearConsole();
        System.out.println("Level: "+name);
        System.out.println(x:"");
        for (int i=0; i< rows; i++)
        {
            for (int j=0; j< column; j++)
            {
                System.out.print(Lv[i][j]);
            }
            System.out.println(x:"");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }   
}    