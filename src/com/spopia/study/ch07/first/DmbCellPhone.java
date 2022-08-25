package com.spopia.study.ch07.first;

public class DmbCellPhone extends CellPhone {
	
	int channel;

	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	DmbCellPhone() {
	}
	
	void turnOnDmb() {
		powerOn();
		System.out.println("방송을 수신합니다.");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("방송 " + channel + "번으로 채널 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("방송 솧출을 멈춥니다.");
		powerOff();
	}
}