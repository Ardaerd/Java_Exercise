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
        System.out.println("----------------------------------------------");
    }

    public void articlesCoAuthored(Author author) {
        System.out.println("Publication of " + nameOfAuthor + " and " + author.getNameOfAuthor() + " together:");

        for (int i = 0; i < author.listOfArticle.size(); i++) {
            for (int j = 0; j < this.listOfArticle.size(); j++) {

                if (author.listOfArticle.get(i).getNameOfArticle().equals(this.listOfArticle.get(j).getNameOfArticle()))
                    System.out.println(this.listOfArticle.get(j).getNameOfArticle() +
                            " (" + this.listOfArticle.get(j).getPublicationYear() + ")");
            }
        }
        System.out.println("----------------------------------------------");
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public ArrayList<Article> getListOfArticle() {
        return listOfArticle;
    }
}
