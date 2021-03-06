package Practice2_2;

import Practice2_2.Controller.Controller;
import Practice2_2.Model.DataHandler;
import Practice2_2.Model.FileHandler;
import Practice2_2.View.Menu;

import java.io.IOException;

public class MainLib
{
    public static void main(String args[]) throws IOException
    {
        Menu menu = new Menu();
        DataHandler handle = new DataHandler();
        Controller.run(handle, menu);
    }
}
