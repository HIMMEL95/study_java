package com.spopia.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// 부모 클래스 생성 메소드 호출
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		cellPhone.bell();
		cellPhone.sendVoice("안녕!");
		cellPhone.receiveVoice("안녕!!");
		cellPhone.hangUp();
		cellPhone.powerOff();
		
		System.out.println("---------------------------");
		
		// 자식 클래스 생성 메소드 호출
		DmbCellPhone dmbCellPhone = new DmbCellPhone("IPhone14", "Purple", 11);
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(16);
		dmbCellPhone.turnOffDmb();
		
		System.out.println("---------------------------");

		// 자식 클래스 생성 부모 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("반가워");
		dmbCellPhone.receiveVoice("나도!!");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
	}
}
