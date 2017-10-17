class Days
{
enum DaysName{Sun,Mon,Tue,Wed,Thurs,Fri,Sat}
DaysName name;
}
public class Daystest
{
public static void main(String[] args)
{
Days days =new Days();
days.name = Days.DaysName.Mon;
System.out.println("Day name is" + days.name);
}
}
