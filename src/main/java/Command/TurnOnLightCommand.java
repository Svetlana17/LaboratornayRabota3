package Command;
//Сoncreate command хранит ссылку для выполгнения конкретной команды объекта Reciver
public class TurnOnLightCommand implements Command{
   private Light theLight;

   public TurnOnLightCommand(Light light){
        this.theLight=light;
       }

   public void execute(){
      theLight.turnOn();
   }
}