
public class Main {

	public static void main(String[] args){
		//error akan terjadi jika dibuat object dari abstract class

		//buat object dari class turunan
		Cat cat = new Cat();

		//panggil method yang sudah di overrride dari abstract method
		cat.makeNoise();

		//membuat object wold ditampung di Abstract class
		Animal obj = new Wolf();
		obj.makeNoise();

		System.out.println();

		//tidak bisa membuat object dari interface, lewat subclass bisa
		//InterfaceSample interfacesample = new InterfaceSample();

		//Membuat object dari class yang implement interface
		RealClassInterface obj2 = new RealClassInterface();
		obj2.interfaceMethod();
		
		//number dari obj2 tidak dapat diganti karena merupakan final
		//obj2.number = 50;
		
		//number dari Interface tidak dapat diganti karena merupakan static final
		//RealClassInterface.number = 50;
	}	
}