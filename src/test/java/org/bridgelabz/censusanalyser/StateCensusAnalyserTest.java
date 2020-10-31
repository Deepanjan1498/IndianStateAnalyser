package org.bridgelabz.censusanalyser;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import CSVBuilder.CSVBuilderFactory;
import CSVBuilder.ICSVBuilder;

public class StateCensusAnalyserTest 
{
	public static final String CENSUS_CSV_FILE = "D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\IndianCSVCensusData.csv";
	public static final String INCORRECT_FILE = ".\sample.txt";
	public static final String INCORRECT_CSV_FILE="D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample3.csv";
	public static final String WRONG_DELIMITER_CENSUS_CSV = "D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample5.csv";
	public static final String INCORRECT_HEADER_CSV="D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample3.csv";
	public static final String STATE_CSV_FILE= "D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\Statecode.csv";
	public static final String INCORRECTSTATE_FILE = ".\sample.txt";
	public static final String INCORRECTSTATE_CSV_FILE = "D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample4.csv";
	public static final String WRONG_DELIMITERSTATE_CENSUS_CSV = "D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample6.csv";
	public static final String INCORRECTSTATE_HEADER_CSV="D:\\DEEPANJAN\\PROJECTS\\CensusAnalyser\\src\\RequiredFiles\\sample4.csv";
	
	
	@Test
	public void givenIndiaCensusDataCsvShouldReturnExactCount() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfEntries = stateCensusAnalyser.loadStateCensusData(CENSUS_CSV_FILE);
			Assert.assertEquals(7,numberOfEntries);
			} 
		catch (CSVBuilderException e) {
			e.printStackTrace();
		}

	}
	@Test
    public void GivenTheStateCensusCsvFile_IfDoesntExist_ShouldThrowCensusAnalyserException() throws IOException {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_FILE);
		}
		catch(CSVBuilderException e) 
		{
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.CENSUS_FILE_PROBLEM, e.exceptionType);
		}
    }
	@Test
	public void givenWrongTypeCSVFile_ShouldThrowExceptionOfType_IncorrectTypeOfCSV() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_CSV_FILE);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.INCORRECT_TYPE_ISSUE, e.exceptionType);
		}
	}
	@Test
	public void givenCsvFile_IFDelimiterIsWrong_ShouldThrowExceptionOfDelimiterISSUE() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadStateCensusData(WRONG_DELIMITER_CENSUS_CSV);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.DELIMITER_ISSUE, e.exceptionType);
		}
	}
	@Test
	public void givenCsvFile_WrongHeaderShouldThrowExceptionOfTypeIncorrectHeader() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadStateCensusData(INCORRECT_HEADER_CSV);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.INCORRECT_HEADER, e.exceptionType);
		}
	}
	@Test
	public void givenIndiaStateCodeDataCsv_ShouldReturnExactCount() {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		try {
			int numberOfEntries = stateCensusAnalyser.loadIndianStateData(STATE_CSV_FILE);
			Assert.assertEquals(6,numberOfEntries);
			} 
		catch (CSVBuilderException e) {
			e.printStackTrace();
		}

	}

	@Test
    public void GivenTheStateCsvFile_IfDoesntExist_ShouldThrowCensusAnalyserException() throws IOException {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadIndianStateData(INCORRECTSTATE_FILE);
		}
		catch(CSVBuilderException e) 
		{
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.CENSUS_FILE_PROBLEM, e.exceptionType);
		}
    }
	@Test
	public void givenStateWrongTypeCSVFile_ShouldThrowExceptionOfType_IncorrectTypeOfCSV() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadIndianStateData(INCORRECTSTATE_CSV_FILE);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.INCORRECT_TYPE_ISSUE, e.exceptionType);
		}
	}
	@Test
	public void givenStateCsvFile_IFDelimiterIsWrong_ShouldThrowExceptionOfDelimiterISSUE() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadIndianStateData(WRONG_DELIMITER_CENSUS_CSV);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.DELIMITER_ISSUE, e.exceptionType);
		}
	}
	@Test
	public void givenStateCsvFile_WrongHeaderShouldThrowExceptionOfTypeIncorrectHeader() {
		try {
			StateCensusAnalyser stateCensusAnalyser=new StateCensusAnalyser();
			ExpectedException exceptionRule= ExpectedException.none();
			exceptionRule.expect(CSVBuilderException.class);
			stateCensusAnalyser.loadIndianStateData(INCORRECTSTATE_HEADER_CSV);
		}catch(CSVBuilderException e) {
			Assert.assertEquals(CSVBuilderException.CSVExceptionType.INCORRECT_HEADER, e.exceptionType);
		}
	}
}