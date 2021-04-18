package Inheritance_and_Interface.ArticleInformation;

import java.util.ArrayList;

public class Article {
    private String nameOfArticle;
    private int publicationYear;
    private ArrayList<Author> listOfAuthor;

    public Article(String nameOfArticle, int publicationYear) {
        this.nameOfArticle = nameOfArticle;
        this.publicationYear = publicationYear;
        listOfAuthor = new ArrayList<Author>();
    }

    public void addAuthor(Author author) {
        listOfAuthor.add(author);
        author.addListOfArticle(this);
    }

    public void listAuthors() {
        System.out.println("Authors of \"" + nameOfArticle + "\" Article:");
        for (int i = 0; i < listOfAuthor.size(); i++) {
            System.out.println(i+1 + "- " + listOfAuthor.get(i).getNameOfAuthor());
        }
        System.out.println("----------------------------");
    }

    public void getAuthorsPublicationCounts() {
        int count = 0;

        for (int i = 0; i < listOfAuthor.size(); i++) {
            count += listOfAuthor.get(i).getListOfArticle().size();
        }

        System.out.println("Authors' Publication Counts: " + count);
        System.out.println("----------------------------------");
    }
}
