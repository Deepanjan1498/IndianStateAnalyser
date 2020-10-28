package org.bridgelabz.censusanalyser;

import java.io.Reader;
import java.util.Iterator;

public interface ICSVBuilder 
{
	 public  <T> Iterator<T> getIteratorCSV(Reader reader, Class<T> csvClass) throws CensusAnalyserException;
}
