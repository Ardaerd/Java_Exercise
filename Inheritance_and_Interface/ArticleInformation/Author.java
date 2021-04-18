package Inheritance_and_Interface.ArticleInformation;

import java.util.ArrayList;

public class Author {
    private String nameOfAuthor;
    private ArrayList<Article> listOfArticle;

    public Author(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
        listOfArticle = new ArrayList<Article>();
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }
}
