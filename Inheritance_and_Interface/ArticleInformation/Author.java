package Inheritance_and_Interface.ArticleInformation;

import java.util.ArrayList;

public class Author {
    private String nameOfAuthor;
    private ArrayList<Article> listOfArticle;

    public Author(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        listOfArticle = new ArrayList<Article>();
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public void addListOfArticle(Article article) {
        listOfArticle.add(article);
    }

    public void listArticlesAfter(int year) {
        System.out.println("Publications of " + nameOfAuthor + " after " + year + ":");

        for (int i = 0; i < listOfArticle.size(); i++) {
            if (listOfArticle.get(i).getPublicationYear() >= year)
                System.out.println(listOfArticle.get(i).getNameOfArticle() +
                        " (" + listOfArticle.get(i).getPublicationYear() + ")");
        }
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public ArrayList<Article> getListOfArticle() {
        return listOfArticle;
    }
}
