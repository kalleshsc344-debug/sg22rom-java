class BookExecutor {

public static void main(String[] args) {

double price = Book.getPrice();
System.out.println("Price: " + price);

String title = Book.getTitle();
System.out.println("Title: " + title);

String author = Book.getAuthor();
System.out.println("Author: " + author);

String publisher = Book.getPublisher();
System.out.println("Publisher: " + publisher);

int pages = Book.getNumberOfPages();
System.out.println("Pages: " + pages);

String language = Book.getLanguage();
System.out.println("Language: " + language);

String genre = Book.getGenre();
System.out.println("Genre: " + genre);

String binding = Book.getBindingType();
System.out.println("Binding Type: " + binding);

String isbn = Book.getISBN();
System.out.println("ISBN: " + isbn);

String pubDate = Book.getPublicationDate();
System.out.println("Publication Date: " + pubDate);

double weight = Book.getWeight();
System.out.println("Weight: " + weight + " grams");

String dimension = Book.getDimensions();
System.out.println("Dimensions: " + dimension);

String country = Book.getCountryOfOrigin();
System.out.println("Country: " + country);

String features = Book.getSpecialFeatures();
System.out.println("Special Features: " + features);

boolean bestseller = Book.isBestseller();
System.out.println("Bestseller: " + bestseller);

}
}
