package Inheritance_and_Interface.ArticleInformation;

public class Main {
    public static void main(String[] args) {
        Author Reyyan = new Author("Reyyan Yeniterzi");
        Author Melih = new Author("Melih Kanderler");
        Author Furkan = new Author("Furkan Kırac");

        Article art1 = new Article("Text Processing with Machine Learning", 2010);
        Article art2 = new Article("Image Labeling", 2013);
        Article art3 = new Article("Image Recognition with Machine Learning",2015);
        Article art4 = new Article("Machine Learning applied to Vision & Text",2017);

        art1.addAuthor(Reyyan);
        art1.addAuthor(Melih);
        art2.addAuthor(Reyyan);
        art2.addAuthor(Furkan);
        art3.addAuthor(Furkan);
        art3.addAuthor(Melih);
        art4.addAuthor(Reyyan);
        art4.addAuthor(Furkan);
        art4.addAuthor(Melih);

        art1.listAuthors();
        art1.getAuthorsPublicationCounts();
    }
}
