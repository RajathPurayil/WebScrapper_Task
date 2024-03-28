package de.mph;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Main {
    public static void main(String[] args) throws  Exception{
        final Document document= Jsoup.connect("https://www.nasdaq.com/market-activity/quotes/historical").get();
       // System.out.println(document.outerHtml());
      for(Element row:document.select(".manual-table")){


   final  String Symbol=row.select("row_0 col_0").text();
   final String CompanyName=row.select("row_0 col_1").text();

  System.out.println(Symbol+"Symbol      "+CompanyName+"Company Name");

        }



    }
}
