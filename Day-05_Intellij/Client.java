import java.rmi.*;
import java.io.*;
public class Client
{
    public static void main(String args[])
    {
        try
        {
            String ip="rmi://127.0.0.1/SERVICE";
            RemoteInterface s=(RemoteInterface)Naming.Lookup(ip);
            System.out.println("sum:"+s.add(1,3));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackaTrace();
        }
    }
}