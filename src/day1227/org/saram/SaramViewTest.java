package day1227.org.saram;

public class SaramViewTest {
	public static ViewContainer vc = new ViewContainer();
	
	public static void main(String[] args) {
		vc.run(R.insertView);
		vc.run(R.saramDelete);
		vc.run(R.saramDetail);
		vc.run(R.saramEdit);
		vc.run(R.saramListView);
	}
}
