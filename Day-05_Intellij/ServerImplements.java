import java.rmi.*;
import java.rmi.server.*;
import java.lang.String;
public class ServerImplements extends UnicastRemoteObject implements RemoteInterface
{
        
public class ServerImplements () throws RemoteException
{
    super();
}
public int add(int x,int y)
{
    return(x+y);
}
}