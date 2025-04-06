package com.xworkz.posterapp;
import com.xworkz.posterapp.poster.Poster;
public class PosterRunner
{
    public static void display(Poster poster)
    {
        System.out.println("Advertizing Company Name : "+poster.getAdvertizingCompany());
        System.out.println("Printing Company Name : "+poster.getPrintingCompany());
        System.out.println("Size of the printer : "+poster.getSize());
        System.out.println("Color of the poster : "+poster.getColor());
        System.out.println("Number of copies of poster : "+poster.getNoOfCopies());
        System.out.println();
        System.out.println();    }
    public static void main(String args[])
    {
        //1
        Poster wonderla=new Poster();
        wonderla.setAdvertizingCompany("Wonderla");
        wonderla.setPrintingCompany("Vistaprint");
        wonderla.setSize("100*100");
        wonderla.setColor("White and SkyBlue");
        wonderla.setNoOfCopies(10);
        PosterRunner.display(wonderla);


        //2
        Poster grs=new Poster();
        grs.setAdvertizingCompany("GRS Fantacy Park");
        grs.setPrintingCompany("Sulekha");
        grs.setSize("80*80");
        grs.setColor("White,yellow and SkyBlue");
        grs.setNoOfCopies(10);
        PosterRunner.display(grs);

        //3
        Poster tanishq=new Poster();
        tanishq.setAdvertizingCompany("Tanishq");
        tanishq.setPrintingCompany("Brijbasi Art Press Ltd");
        tanishq.setSize("120*120");
        tanishq.setColor("Pink and Brown");
        tanishq.setNoOfCopies(15);
        PosterRunner.display(tanishq);

        //4
        Poster malabar=new Poster();
        malabar.setAdvertizingCompany("Malabar Gold and Diamonds");
        malabar.setPrintingCompany("Shital Signs");
        malabar.setSize("120*120");
        malabar.setColor("White and Gold");
        malabar.setNoOfCopies(25);
        PosterRunner.display(malabar);

        //5
        Poster kalyan=new Poster();
        kalyan.setAdvertizingCompany("Kalyan Jewellars");
        kalyan.setPrintingCompany("Excel Printers Pvt Ltd");
        kalyan.setSize("50*50");
        kalyan.setColor("Pink and Gold");
        kalyan.setNoOfCopies(5);
        PosterRunner.display(kalyan);

        //6
        Poster ikea=new Poster();
        ikea.setAdvertizingCompany("IKEA");
        ikea.setPrintingCompany("Surarchit Print Pack");
        ikea.setSize("120*120");
        ikea.setColor("Blue and White");
        ikea.setNoOfCopies(20);
        PosterRunner.display(ikea);

        //7
        Poster darkFantacy=new Poster();
        darkFantacy.setAdvertizingCompany("SunFeast");
        darkFantacy.setPrintingCompany("Sinex Vision");
        darkFantacy.setSize("90*90");
        darkFantacy.setColor("Black and Red");
        darkFantacy.setNoOfCopies(8);
        PosterRunner.display(darkFantacy);





    }
}
