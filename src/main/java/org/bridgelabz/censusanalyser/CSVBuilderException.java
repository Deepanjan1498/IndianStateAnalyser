package org.bridgelabz.censusanalyser;

import org.bridgelabz.csvbuilder.CSVBuilderException.CSVExceptionType;

public class CSVBuilderException extends Throwable {
	public CSVExceptionType exceptionType;
	public enum CSVExceptionType
	{
		CENSUS_FILE_PROBLEM,INCORRECT_TYPE_ISSUE,DELIMITER_ISSUE,INCORRECT_HEADER,NO_CENSUS_DATA
	}
	
	

	public CSVBuilderException(CSVExceptionType exceptionType,String message) {
		super(message);
		this.exceptionType = exceptionType;
	}

}
