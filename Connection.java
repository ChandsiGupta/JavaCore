//Singletone with Enum
public class Connection
{
private static Connection connection=new Connection();
public enum ConnectionState 
{
 WIFI,MobileNetwork,NoConnection;

}

//Private ctor
  private Connection( )
{

}

//public Connection( EnumState.ConnectionState c)
//{
//this.CS=C;
//}

 public void  getState(ConnectionState cs)
{

               if(cs==ConnectionState.WIFI)
{
                System.out.println("Connected to WIFI.");
                }
              if(cs==ConnectionState.MobileNetwork)
{
                System.out.println("Connected to MobileNetwork");
}
}
//get only object 
public static Connection getInstance()
{
return connection;
}
public static void main(String []args)
{
connection.getState(ConnectionState.WIFI);


//Connection object=Connection.getInstance();

//object.getState();

}
}



