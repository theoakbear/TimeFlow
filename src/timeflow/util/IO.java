package timeflow.util;

import java.io.*;
// import java.nio.MappedByteBuffer;
// import java.nio.channels.FileChannel;
// import java.nio.channels.FileChannel.MapMode;
// import java.nio.charset.Charset;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;
import java.util.*;

public class IO {
	private static final int MAX_READ_BUFFER_SIZE = 1024*1024;

	public static ArrayList<String> lines(String fileName) throws IOException
	{
		ArrayList<String> a=new ArrayList<String>();
		String line=null;
		FileReader fr=new FileReader(fileName);
		BufferedReader in=new BufferedReader(fr);
		while (null != (line=in.readLine()))
			a.add(line);
		in.close();
		fr.close();
		return a;
	}
	
	public static String[] lineArray(String fileName) throws IOException
	{
		ArrayList<String> a=lines(fileName);
		return (String[])a.toArray(new String[0]);
	}
	
	public static String read(File file) throws IOException
	{
		long startTime = System.currentTimeMillis();
		// FileInputStream readFileStream = new FileInputStream(file);
		// FileChannel readChannel = readFileStream.getChannel();
		// String result = readFromChannel(readChannel);
		// readFileStream.close();
		char[] buffer = new char[MAX_READ_BUFFER_SIZE];
		int n = 0;
		StringBuilder builder = new StringBuilder();
		FileReader reader = new FileReader(file);
		BufferedReader b = new BufferedReader(reader);
		while ((n = b.read(buffer, 0, buffer.length)) != -1) 
			builder.append(buffer, 0, n);
		b.close();
		reader.close();
		String result = builder.toString();

		System.out.println(String.format("Time to read file: %d", System.currentTimeMillis() - startTime));
	 	return result;
	}
	
	public static String read(String fileName) throws IOException
	{		
		// long startTime = System.currentTimeMillis();
		// Path filePath = Paths.get(fileName);
		// FileChannel readChannel = (FileChannel)Files.newByteChannel(filePath, StandardOpenOption.READ);	
		// String result = readFromChannel(readChannel);
		// readChannel.close();

		int n = 0;
		StringBuilder builder = new StringBuilder();
		char[] buffer = new char[MAX_READ_BUFFER_SIZE];
		FileReader reader = new FileReader(fileName);
		BufferedReader b = new BufferedReader(reader);
		while ((n = b.read(buffer, 0, buffer.length)) != -1) 
			builder.append(buffer, 0, n);
		b.close();
		reader.close();

		String result = builder.toString();
		//System.out.println(String.format("Time to read file: %d", System.currentTimeMillis() - startTime));
		return result;
	}

	// private static String readFromChannel(final FileChannel channel) throws IOException {
	// 	StringBuilder builder = new StringBuilder();
	// 	long position = 0;
	// 	long size = channel.size();
		
	// 	while (position < size) {
	// 		long mappingSize = Math.min(size - position, MAX_READ_BUFFER_SIZE);
	// 		MappedByteBuffer mappedBuffer = channel.map(MapMode.READ_ONLY, position, mappingSize);
	// 		String partialContent = Charset.forName("UTF-8").decode(mappedBuffer).toString();
	// 		builder.append(partialContent);
	// 		position += mappingSize;
	// 	}

	// 	return builder.toString();
	// }
}
