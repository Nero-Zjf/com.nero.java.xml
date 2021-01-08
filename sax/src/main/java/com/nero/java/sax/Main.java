package com.nero.java.sax;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            SaxHandler saxHandler = new SaxHandler();
            saxParser.parse(Main.class.getClassLoader().getResource("book.xml").toURI().toString(), saxHandler);
            for (Book book :
                    saxHandler.getBookList()) {
                System.out.println(book);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
