package com.io;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {
	private int id;
	private String name;
	private Map<String,String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	
	public void displayInfo()
	{
		System.out.println("question id:" +id);
		System.out.println("question name" +name);
		System.out.println("Answers...");
         for(Map.Entry<String, String> entry:answers.entrySet())
         {
        	 System.out.println(entry.getKey()+" "+entry.getValue());
         }
		}
		
	}

