package com.spopia.study.ch08.first;

public class RemoteControlExample {
	
	public static void main(String[] args) {
		
		
		/*
		 * RemoteControl telvision = new Television(); 
		 * RemoteControl remoteControl = new Television(); 
		 * Television television2 = new Television(); // 잘못된 경우
		 */		// interface 변수명 = new 클래스 
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		RemoteControl.changeBattery();
		remoteControl.turnOff();
		
//		Audio audio = new Audio();
//		Television television = new Television();
//		
////		audio.turnOn();
////		audio.turnOff();
//		television.turnOn();
//		television.setMute(true);
//		television.setMute(false);
//		television.setVolume(-10);
//		RemoteControl.changeBattery();
//		television.turnOff();
//		
//		System.out.println();
////		인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 않된다.
//		
////		인터페이스를 구현한 클래스를 사용해야 된다. 할때는
////		RemoteControl remoteControl;	// 인터페이스 변수 선언
////		remoteControl = new Audio();	// 구현객체로  초기화
//		
//		RemoteControl remoteControl = new Audio();
////		RemoteControl remoteControl = new Television();
//		
//		remoteControl.turnOn();
//		remoteControl.turnOff();
//		remoteControl.setMute(false);
	}

}
