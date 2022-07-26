package com.example.moviejournal2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class MovieManager {

    public MovieManager() {}

    public static ArrayList<Movie> readXml(String url) {

        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(url);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getDocumentElement().getElementsByTagName("Event");
            ArrayList<Movie> movies = new ArrayList<>();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node n = nodeList.item(i);
                if (n.getNodeType() == n.ELEMENT_NODE) {
                    Element element = (Element) n;
                    String id = element.getElementsByTagName("ID").item(0).getTextContent();
                    String title = element.getElementsByTagName("Title").item(0).getTextContent();
                    Integer year = Integer.parseInt(element.getElementsByTagName("ProductionYear").item(0).getTextContent());
                    String genre = element.getElementsByTagName("Genres").item(0).getTextContent();
                    String imageUrl = element.getElementsByTagName("EventSmallImagePortrait").item(0).getTextContent();
                    Movie movie = new Movie(id, title, year, genre, imageUrl);
                    movies.add(movie);
                }
            }
            return movies;
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }



}
