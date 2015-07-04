package org.codecounselor.java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Workbook {
	
	private void readFile_Java8() {
		try ( Stream<String> lines = Files.lines(Paths.get("")) ) {
			lines.filter( l -> l.startsWith("D") ); //Detail record
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}