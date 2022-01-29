package net.talaatharb.projecteuler100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * P022
 * 
 * @author mharb
 *
 */
public class P022 extends Solution {

	/**
	 * Problem solution entry point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new P022().run();
	}

	private List<String> readNames(String fileName) {
		List<String> names = new ArrayList<>();
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		InputStreamReader streamReader = new InputStreamReader(classLoader.getResourceAsStream(fileName));
		BufferedReader reader = new BufferedReader(streamReader);
		
		try {
			String data = reader.readLine();
			String[] parts = data.split(",");
			for (String part : parts) {
				names.add(part.substring(1, part.length() - 1));
			}
			
			Collections.sort(names);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return names;
	}
	
	private int calculateNameValue(String name) {
        int value = 0;
        for(int i = 0; i < name.length(); i++) {
            value += (name.charAt(i) - ('A') + 1);
        }
        return value;
	}

	@Override
	public Number solve() {
		problemNumber = 22;
		int result = 0;
		List<String> names = readNames("p022.txt");
		for(int i = 0; i < names.size(); i++) {
			result += calculateNameValue(names.get(i)) * (i+1);
		}

		return result;
	}

}
