package pl.javasolution.loops;

public class LoopMain {

    public static void main(String[] args) {

        //pętla for
//        for (int i = 1; i < 4; i++) {
//            System.out.println("Checking invoice number: " + i);
//        }
//        System.out.println("Performing further operations.");

//        boolean invoiceFound = true;
//
//        while(invoiceFound) {
//            System.out.println("Searching for invoices.");
//            invoiceFound = false;
//        }
//
//        System.out.println("Invoice found.");


        //szukanie faktur
        boolean searchInProgress = true;
        int numberOfInvoices = 0;

        do {
            numberOfInvoices++;
            if (numberOfInvoices == 2) {
                searchInProgress = false;
            }
        } while (searchInProgress);
        System.out.println("Finished do while");
    }
}
