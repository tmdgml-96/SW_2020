package commandPattern;

// 차고문 열기

public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		//GarageDoor gargeDoor = new GarageDoor();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		//remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}

}
