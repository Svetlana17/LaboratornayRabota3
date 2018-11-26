package Command;
//Main class -client
public class TestCommand{
   public static void main(String[] args){
       ///Receiver объект котому предназен объект
       // Command располагет инф-цие о способах вып. конктретных операций
       Light l=new Light();
       //храниться ссылка для вып. конкретной команды объекта Reciver
       Command switchUp=new TurnOnLightCommand(l);
       //храниться ссылка для вып. конкретной команды объекта Reciver
       Command switchDown=new TurnOffLightCommand(l);
       //Invoker вызывает методы для выпол. конктретных команд
      // Switch s=new Switch(switchUp,switchDown);
       
     //  s.flipUp();
     //  s.flipDown();
   }
}