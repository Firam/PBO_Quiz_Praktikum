import java.util.Scanner;
public class quizpraktek {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		String nama;
		int jumlahunit,bayar,kembalian,harga,total;
		char tipe,merek;
			System.out.println("~Selamat datang ditoko kami~");
			System.out.println("Merek barang yang tersedia ditoko kami:");
			System.out.println("Merek berkualitas G");
			System.out.println("Merek berkualitas O");
			System.out.println("Anda memilih merek?");
			merek = input.next().charAt(0);
		switch (merek) {
			case ('g'):
			System.out.println("Tipe yang tersedia ditoko kami :");
			System.out.println("meja (m) = Rp.95.000/pcs");
			System.out.println("kursi (k) = Rp. 125.000/pcs");
			System.out.println("lemari (l) = Rp.450.000/pcs");
			System.out.println("Tipe yang anda pilih? (masukkan dalam bentuk kode tipe)");
			tipe = input.next().charAt(0);
				
				switch (tipe) {
					case('m'):
					harga=95000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
					case('k'):
					harga=125000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
					case('l'):
					harga=450000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
				}
				break;
			case ('o'):
			System.out.println("Tipe yang tersedia ditoko kami :");
			System.out.println("meja (m) = Rp.115.000/pcs");
			System.out.println("kursi (k) = Rp. 135.000/pcs");
			System.out.println("lemari (l) = Rp.550.000/pcs");
			System.out.println("Tipe yang anda pilih? (masukkan dalam bentuk kode tipe)");
			tipe = input.next().charAt(0);
				
				switch (tipe) {
					case('m'):
					harga=155000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
					case('k'):
					harga=135000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
					case('l'):
					harga=550000;
					System.out.println("Berapa banyak yang ingin anda beli ?");
					jumlahunit = input.nextInt();
					System.out.println();
					total = jumlahunit * harga;
					System.out.println("Total belanja anda = Rp." +total);
					System.out.println("Jumlah uang anda = Rp. ");
					bayar = input.nextInt();
					System.out.println();
					
						kembalian = bayar-total;
						System.out.println("Total kembalian anda = Rp. " +kembalian);
				break;
	}
	break; 
			default:
				System.out.println("merek/tipe yang anda masukkan belum tersedia");
			break;	
		}
	}
}