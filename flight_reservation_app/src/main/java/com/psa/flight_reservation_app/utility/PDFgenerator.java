package com.psa.flight_reservation_app.utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.psa.flight_reservation_app.entity.Reservation;



@Controller

public class PDFgenerator {
	
	public void generateItinerary(Reservation reservation1,String filePath) {
		Document document=new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
				document.open();
				document.add(generateTable(reservation1));
				document.close();
			}catch(FileNotFoundException | DocumentException e) {
				e.printStackTrace();
			}
		}

	private  PdfPTable generateTable(Reservation reservation1) {
		 PdfPTable table=new  PdfPTable(2);
		 PdfPCell cell;
		 
		 
		 cell=new PdfPCell(new Phrase("Flight Itinerary"));
		 cell.setColspan(2);
		 table.addCell(cell);
		 
		 
		 cell=new PdfPCell(new Phrase("Flight Details"));
		 cell.setColspan(2);
		 table.addCell(cell);
		 
		 
		 table.addCell("DEPARTURE_CITY");
		 table.addCell(reservation1.getFlight().getDEPARTURE_CITY());
		 
		 
		 table.addCell("ARRIVAL_CITY");
		 table.addCell(reservation1.getFlight().getARRIVAL_CITY());
		 
		 
		 table.addCell("FLIGHT_NUMBER");
		 table.addCell(reservation1.getFlight().getFLIGHT_NUMBER());
		 
		 table.addCell("OPERATING_AIRLINES");
		 table.addCell(reservation1.getFlight().getOPERATING_AIRLINES());
		 
		 

		 
		 cell=new PdfPCell(new Phrase("Passenger Details"));
		 cell.setColspan(2);
		 table.addCell(cell);
		 
		 
		table.addCell("First Name");
		table.addCell(reservation1.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reservation1.getPassenger().getLastName());
		
		

		table.addCell("Middle Name");
		table.addCell(reservation1.getPassenger().getMiddleName());
		

		table.addCell("Email");
		table.addCell(reservation1.getPassenger().getEmail());
		
		

		table.addCell("Phone");
		table.addCell(reservation1.getPassenger().getPhone());
		
		
		return table;
	}

}

	
	



