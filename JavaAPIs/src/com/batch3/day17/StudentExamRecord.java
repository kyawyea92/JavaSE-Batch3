package com.batch3.day17;

public class StudentExamRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StudentExamRecord record = new StudentExamRecord();
		String result =record.checkExamResultByNameAndRollNumber("mg mg", "3CS-001");
		System.out.println(result);
		*/
		
		ExamResultByName examResult = (String name, String rollNumber) -> name.equalsIgnoreCase("Mg Mg") && rollNumber.equals("3CS-001") 
				? name +" - "+ rollNumber + " : Pass"
			    : name + " - "+ rollNumber + " : Fail";
		
		String result = examResult.checkExamResultByNameAndRollNumber("mg mg", "3CS-001");
		System.out.println(result);
		
	}
/*
	public String checkExamResultByNameAndRollNumber(String name,String rollNumber) {
		
		if(name.equalsIgnoreCase("Mg Mg") && rollNumber.equals("3CS-001")) {
			return name +" - "+ rollNumber + " : Pass";
		}
		return name + " - "+ rollNumber + " : Fail";
	}
	*/
}
