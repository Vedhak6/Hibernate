package com.xworkz.punith;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.xworkz.punith.dao.PunithDAO;
import com.xworkz.punith.dao.PunithDAOImpl;
import com.xworkz.punith.dto.PunithDTO;


public class Tester {
	
public static void main(String[] args) throws IOException {
		
		
        FileInputStream file= new FileInputStream(new File("C:\\Users\\VEDHA\\Desktop\\data.xlsx"));
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheetAt(0);
        Row row;
        for(int i=1;i<=sheet.getLastRowNum();i++) {
        	row = (Row) sheet.getRow(i);
        	
            if(row.getCell(0)==null) {} else
				row.getCell(0).toString();
        	String NAME;
        	if(row.getCell(1)==null) { NAME="null";}
        	else NAME=row.getCell(1).toString();
        	String PLACE;
        	if(row.getCell(2)==null) { PLACE="null";}
        	else PLACE=row.getCell(2).toString();
        	
        	
        	PunithDTO punithdto = new PunithDTO();
      //  	punithdto.setId(Double.parseDouble(ID));
        	punithdto.setName(NAME);
        	punithdto.setPlace(PLACE);
        	  
		    PunithDAO daoImpl = new PunithDAOImpl();
			daoImpl.savePunith( punithdto);

        }
        file.close();
		
	}
			  

}