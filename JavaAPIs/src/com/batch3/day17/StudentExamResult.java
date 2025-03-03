package com.batch3.day17;

import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//import java.util.Scanner;

public class StudentExamResult {
	
	public static double mark = 60;
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Input mark: ");
		double mark = sc.nextDouble();
		
		StudentExamResult oldFormat = new StudentExamResult();
		String result = oldFormat.checkExamResult(mark);
		System.out.println(result);
		
		
		//FunctionalInterface = lambda
		ExamResult examResult = (double mark) -> {
			if(mark >= 50) {
				return "Pass";
			}
			return "Fail";
		};
		ExamResult examResult = (double mark) -> {
			return mark >= 50 ? "Pass": "Fail";
		};
		
		*/
		
		ExamResult<Integer,String> examResult = (Integer mark) ->  mark >= 50 ? "Pass" : "Fail";
		ExamResult<Double,Boolean> examResult2 = (Double mark) -> mark.isNaN();
		String result2 = examResult.checkExamResult(Integer.valueOf(40));
		Boolean result3 = examResult2.checkExamResult(Double.valueOf(30.3));
		System.out.println(result2);
		System.out.println(result3);
		
		
		Predicate<String> checkValue = (String name) -> name.contains("K");
		Predicate<String> startValue = (String name) -> name.startsWith("A");
		System.out.println("Predicate with And condition : "+checkValue.or(startValue).test("Maung Kyaw"));
		
		BiPredicate<String, String> checkInput = (String name,String address) -> name.startsWith("M")  && address.contains("Y");
		System.out.println("Result is "+checkInput.test("Maung Aung", "Yangon"));
		
		//Consumer<String> consumerValue = (String name) -> System.out.println(name.toLowerCase());
		Consumer<String> consumerValue = (String name) -> {
			String lowerValue = name.toLowerCase();
			String formatValue = "";
			if(name.startsWith("U")) {
				formatValue = "My small letter name is : "+lowerValue;
			}else {
				formatValue = "My original letter name is : "+name;
			}
			System.out.println(formatValue);
		};
		consumerValue.accept("Mg Ba");
		
		Supplier<LocalDate> today = () -> LocalDate.now();
		System.out.println(today.get());
		//System.out.println(today);
		
		StudentExamResult resultObject = new StudentExamResult();
		double salaryResult =resultObject.checkMySalaryRank2(20_000.55234233);
		System.out.println(salaryResult);
		
		Function<Double, String> checkMySalaryRank = (Double salary) -> {
			if(salary > 10_000_000) {
				return "My salary grade is A";
			}
			return "My salary grade is B";
		};
		
		String myRank = checkMySalaryRank.apply(20_000_000.00);
		System.out.println(myRank);
	}
	/*
	public String checkExamResult(double mark) {
		if(mark >= 50) {
			return "Pass";
		}
		return "Fail";
	}

	
	public void doSomething(String name) {
		//name.concat(" has Bachelor Degree");
		System.out.println(name.toLowerCase());
	}
	
	
	public LocalDate getTodayDate() {
		return LocalDate.now();
	}*/
	
	public String checkMySalaryRank(Double salary) {
		if(salary > 10_000_000) {
			return "My salary grade is A";
		}
		return "My salary grade is B";
	}
	
	public double checkMySalaryRank2(Double salary) {
		if(salary > 10_000) {
			return Math.floor(salary);
		}
		return salary;
	}
}
