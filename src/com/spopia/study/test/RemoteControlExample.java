package com.spopia.study.test;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl remoteControl = new Television();
		
		// volume = 100
		System.out.println("volume : 100");
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(100);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		
		System.out.println("----------------------------------");

		// volume = -10
		System.out.println("volume : -10");
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
	}

}
