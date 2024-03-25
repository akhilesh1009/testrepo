package artistssales;

import java.util.Scanner;

/**
 *
 * @author akhil
 */
public class ArtistsSales 
{

    public static void main(String[] args) 
    {
 
        Scanner scanner = new Scanner(System.in);

        //List of Artists.
        String[] artists = {"POST MALONE", "TOM GRENNAN", "KANYE WEST", "ISLAND BOYZ", "CHIEF KEEF", "JMX"};

        //CD, DVD and Blu-ray sales for all artists.
        double[][] artistSales
                = {
                    {500000, 200000, 500000}, //POST MALONE Sales.
                    {300000, 100000, 150000}, // COLDPLAY Sales.
                    {400000, 150000, 300000}, // TOM GRENNAN Sales.
                    {250000, 182000, 100000}, // T SWIFT Sales.
                    {600000, 250000, 400000} //SHEERAN Sales.
                    {700000, 550000, 700000} //SHEERAN Sales.
                };

        while (true) {
            //Will Display the artists selection menu.
            System.out.println("Select an artist to view their sales for 2017:");
            for (int i = 0; i < artists.length; i++) {
                System.out.println((i + 1) + ". " + artists[i]);
            }            
            System.out.println("6. DISPLAY TABLE WITH ALL ARTISTS SALES FOR 2017");
            System.out.println("0. Exit");
            System.out.println("");
            //scanner accepting input
            int artictSelect = scanner.nextInt();
            //if 0 is entered the loop is terminated
            if (artictSelect == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            
            if (artictSelect >= 1 && artictSelect <= artists.length) 
            {
                int artistIndex = artictSelect - 1;
                String artistName = artists[artistIndex];
                double CDSales = artistSales[artistIndex][0];
                double DVDSales = artistSales[artistIndex][1];
                double BluRaySales = artistSales[artistIndex][2];
                double totalSales = CDSales + DVDSales + BluRaySales;

                //Display the artist and the total CD, DVD, Blu-ray and Total Sales.
                System.out.println(artistName + " sales for 2017 were:");
                System.out.println("CD SALES: R " + String.format("%.2f", CDSales));
                System.out.println("DVD SALES: R " + String.format("%.2f", DVDSales));
                System.out.println("BLU RAY SALES: R " + String.format("%.2f", BluRaySales));
                System.out.println("TOTAL SALES: R " + String.format("%.2f", totalSales) + "\n");
            } else if(artictSelect == 6)
            {
                
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("|ARTIST\t\t|\tCD SALES\t\tDVD SALES\t\tBLUE RAY SALES\t\t|");
                System.out.println("-------------------------------------------------------------------------------------------------");
                for(int i=0;i<5;i++)
                {
                    System.out.println("|"+artists[i]+"\t|\t"+artistSales[i][0]+"\t\t"+artistSales[i][1]+"\t\t"+artistSales[i][2]+"\t\t|");
                }
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("");
                
                
            }
            else
            {
                System.out.println("Invalid selection.\n");
            }
            
        }
    }
}
