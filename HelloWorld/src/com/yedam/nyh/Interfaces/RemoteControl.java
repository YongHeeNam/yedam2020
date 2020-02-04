package com.yedam.nyh.Interfaces;

public interface RemoteControl {
//(상수)필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 생성자는 없음
	// (추상) 메소드
	public abstract void turnOn();

	public void turnOff();
}
