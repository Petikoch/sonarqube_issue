package foo42;

import model42.PresentationModel42;

public class Main42 {

	public static void main(String[] args) {
		new Main42().start();
	}

	private void start() {
		PresentationModel42 presentationModel = new PresentationModel42();
		System.out.println(presentationModel.getCpuLoadSetpointPercentage());
	}
}
