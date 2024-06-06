import java.util.ArrayList;

public class Log
{
    private ArrayList<String> logEntries;

    public Log()
    {
        this.logEntries = new ArrayList<String>();
    }

    public void log(String message)
    {
        logEntries.add(message);
    }
    public void displayLog()
    {
        System.out.println("Calculator Logs:");

        for(String entry : logEntries)
        {
            System.out.println(entry);
        }
    }
}
