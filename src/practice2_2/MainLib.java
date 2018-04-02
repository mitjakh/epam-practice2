package practice2_2;

import practice2_2.Controller.Controller;
import practice2_2.Model.DataHandler;
import practice2_2.View.Menu;

public class MainLib
{
    public static void main(String args[])
    {
        Menu menu = new Menu();
        DataHandler handle = new DataHandler();
        Controller.run(handle, menu);
    }
}
