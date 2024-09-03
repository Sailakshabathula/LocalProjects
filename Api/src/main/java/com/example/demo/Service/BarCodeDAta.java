package com.example.demo.Service;

import java.io.IOException;

import java.awt.Color;

import com.aspose.barcode.generation.BarcodeGenerator;


//import java.io.IOException;

//import com.aspose.barcode.generation.BarcodeGenerator;
//import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;

public class BarCodeDAta {
   public static void main(String args[]) throws IOException {
	   BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.CODE_128, "Aspose.BarCode"); 
	
	generator.getParameters().getCaptionAbove().setVisible(true);
	generator.getParameters().getCaptionBelow().setText("The Welcome.");
	generator.getParameters().getCaptionBelow().setVisible(true);
	// set image resolution
	generator.getParameters().setResolution(1000);
	//generator.getParameters().getBarcode().setBarHeight(50); // Set height of bars
    //generator.getParameters().getBarcode().setBarWidth(1); // Set width of bars
    
    // Set margins
	// generator.getParameters().getBarcode().getXDimension().setMillimeters(1.0f); // Set width of bars
	generator.save("generate-barcode-with-caption.png");
        
    }
}

