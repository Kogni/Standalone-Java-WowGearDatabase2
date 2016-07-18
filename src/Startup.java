import javax.swing.JFrame;

public class Startup {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Starting Gear Database Builder");

		Reader Class_Reader = new Reader();
		GUI GUIen = new GUI(Class_Reader);
		GUIen.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
	}
}
