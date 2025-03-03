package com.batch3.day17;

@FunctionalInterface
public interface ExamResult<T,R> {
	R checkExamResult(T mark); //exactly one abstract method
}
