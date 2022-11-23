public class HolaMundo {
	
	public void saludar(){
		System.out.println("Hola Mundo!");
	}
	
	public static void main(String[] args){
		HolaMundo hm = new HolaMundo();
		hm.saludar();
		System.out.println("Este es el mensaje que ajustamos en hot-fix.");
	}
}