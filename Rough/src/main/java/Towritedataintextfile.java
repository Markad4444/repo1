import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Towritedataintextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw = null;
try {
	fw = new FileWriter("E:\\New folder\\Rough\\File11\\a.txt");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
BufferedWriter bw=new BufferedWriter(fw);
try {
	bw.write("selenium with java");
	bw.write("selenium with python");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

bw.close();

	}

}
