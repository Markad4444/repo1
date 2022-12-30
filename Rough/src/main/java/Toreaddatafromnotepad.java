import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Toreaddatafromnotepad {

	public static void main(String[] args) {
try {
	FileReader fr= new FileReader("E:\\New folder\\Rough\\File11\\a.txt");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Readable fr = null;
Scanner sc= new Scanner(fr);
while(sc.hasNextLine())
{
	System.out.println(sc.nextLine());
}
sc.close();
	}

}
