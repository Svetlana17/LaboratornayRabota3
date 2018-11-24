package Command;
//Concreate Command ссылка на вып. конктретной команда объекта Reciver
public class TurnOffLightCommand implements Command{
   private Light theLight;

   public TurnOffLightCommand(Light light){
        this.theLight=light;
       }

   public void execute(){
      theLight.turnOff();
   }
}