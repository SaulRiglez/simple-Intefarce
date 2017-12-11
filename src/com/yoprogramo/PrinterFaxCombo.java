package com.yoprogramo;

import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {

    private Object incomingFax;
    private int inkLevel;
    
    public static void main(String[] args) {
	// write your code here
    }

    @Override
    public void sendFax(File f, int number) {
        dialNumber();
        faxFile(f);
    }

    private void faxFile(File f) {
        /* Send the File f as a fax*/
    }

    private boolean dialNumber() {
        boolean success = true;
        /* Dial number set success to false if it is not successful */
        return success;
    }

    @Override
    public Object getReceivedFaxes() {
        return incomingFax;
    }

    @Override
    public void printFile(File f) {
        sendFileToPrinter(f);

    }

    public int getInkLevel() {
        return inkLevel;
    }

    private void sendFileToPrinter(File f) {
        /* Print the File f */
    }

    /*
     * This class would contain many more methods to
     * implement all of this functionality
     */
}
