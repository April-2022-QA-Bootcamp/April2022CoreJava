package lec51_java_coding_challenge;

import java.util.HashMap;

// This question was asked to Sana Naeem
public class E07_duplicate_characters_in_a_string_and_how_many_times {

	public static void main(String[] args) {
		String s = "a beautiful beach bob";
        String[]arr = s.split(" ");
        StringBuilder duplicates = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].equalsIgnoreCase(arr[j]) && ! duplicates.toString().contains(arr[i])){
                    System.out.println(arr[i]);
                    duplicates.append(" ").append(arr[i]);
                }
            }
        }
	}
}
