package writeReadStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class writeReadStream 
{

private static final String OUTPUT_FILE = "/home/cloudera/workspace/writeReadStream/src/writeReadStream/testFile";
	
	public static void writeToStream()
	{
		
	        String content = "Hello Java Code Geeks";

	        byte[] bytes = content.getBytes();

	        char[] chars = content.toCharArray();

	        try (ByteArrayOutputStream out= new ByteArrayOutputStream()) 
	        {

	            out.write(bytes);

	            System.out.println(Arrays.toString(out.toByteArray()));
	            System.out.println(out.toString());

	            // Write the internal buffer to an output stream
	            out.writeTo(new FileOutputStream(OUTPUT_FILE));

	        } catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	}
	 
	public static void WriteAvro()
	{
		
	}
	    
	public static void main(String[] args) 
	{
		writeToStream();
	}

}
