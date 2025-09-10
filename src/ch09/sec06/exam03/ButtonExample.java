package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		//Ok버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());

		btnOk.click();
		
		
		
		//cancel 버튼 객체 생성하기
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");	
			}
		
		}

		//Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
		
	}

}
