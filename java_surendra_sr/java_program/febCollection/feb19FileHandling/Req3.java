import java.io.*;
import java.util.*;
public class Req3{
	public static void main(String args[])throws IOException, FileNotFoundException{
		//write();
		read();
	}
	public static void read()throws IOException, FileNotFoundException{
	DataInputStream dis=new DataInputStream(new FileInputStream("data3.txt"));
		int data;
		int a=dis.readInt();
		int b=dis.readInt();
		int c=dis.readInt();
		int d=dis.readInt();
		int e=dis.readInt();
		int f=dis.readInt();
		int g=dis.readInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		dis.close();
	}
	
	public static void write()throws IOException, FileNotFoundException{
	DataOutputStream  dos=new DataOutputStream(new FileOutputStream("data3.txt"));
	dos.writeInt(10);
	dos.writeInt(20);
	dos.writeInt(30);
	dos.writeLong(30);
	dos.writeInt(65);
	dos.writeInt(66);
	dos.writeChar(66);

	System.out.println("file closed successfully");
		dos.close();
	}
}