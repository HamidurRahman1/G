
import javafx.application.Platform;
import view.View;

public class GraphGUI extends View
{
    public static void main(String[] args)
    {
        try
        {
            View.launch();
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage() + "\n" + ex.getCause());
            Platform.exit();
        }
    }
}
