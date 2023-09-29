package WebScraper;

import WebScraper.JSoup;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
        private String url;
        public static JSoup jSoup;
        public static ArrayList<String> jSoups = new ArrayList<>();
        private static String value = JOptionPane.showInputDialog(null,"Please Enter the url:");;
        public static URL urls = new URL();
        public static void main(String[] args) throws IOException {
            jSoups.add(value);
            for(String url: urls.getUrls()) {
                jSoups.add(url);
            }
            jSoup = new JSoup(jSoups);
            jSoup.getDocument();
//        String s1 = "Happy Birthday to you";
//        String s2 = "How is your birthday";
//        String s3 = "Happy jayanti";
//        jSoups.add(s1);
//        jSoups.add(s2);
//        jSoups.add(s3);
        }
    }


