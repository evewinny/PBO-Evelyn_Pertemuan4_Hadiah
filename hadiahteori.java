import java.util.Scanner;
public class hadiahteori
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		int nt1, nt2, nt3, mid, nfinal;
		double rata, akhir;
		String nama, hakhir;
	
		System.out.print("Masukkan namamu: ");
		nama=input.nextLine();
		
		System.out.print("Masukkan nilai tugas 1: ");
		nt1=input.nextInt(); 
		
		System.out.print("Masukkan nilai tugas 2: ");
		nt2=input.nextInt();
		
		System.out.print("Masukkan nilai tugas 3: ");
		nt3=input.nextInt();
		
		System.out.print("Masukkan nilai mid: ");
		mid=input.nextInt();
		
		System.out.print("Masukkan nilai final: ");
		nfinal=input.nextInt();
		
		rata=(nt1+nt2+nt3)/3;
		akhir=(rata*0.3)+(mid*0.3)+(nfinal*0.4);
		
		System.out.println();
		System.out.println("Halo "+nama+","+" Nilai akhir kamu adalah "+akhir);
		
		if (akhir >= 80) {
			System.out.print("Nilai huruf kamu adalah: A");
		}
		else if (akhir >= 60) {
			System.out.println("Nilai huruf kamu adalah: B");
		}
		else if (akhir >= 50) {
			System.out.println("Nilai huruf kamu adalah: C");
		}
 		else if (akhir >= 40) {
			System.out.println("Nilai huruf kamu adalah: D");		
		}
		else if (akhir < 40) {
			System.out.println("Nilai huruf kamu adalah: E");
		}
	}
}