package ch09.sec06.exam03;

public class Button {
	//정적 맴버 인터페이스 
	public static interface ClickListener {
		void onClick();
	}
	//필드
	private ClickListener clickListner;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListner = clickListener;
	}
	
	public void click() {
		this.clickListner.onClick();
	}
	
}

