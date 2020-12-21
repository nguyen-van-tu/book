public class FictionBook extends Book implements Discount {
    private String category;
    public double promotionalPrice;

    public FictionBook() {


    }

    public FictionBook(int book, String name, float price, String author, String category) {
        super(book, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



    @Override
    public double setDiscount(int persent) {
        return promotionalPrice = getPrice() * (100 - persent) / 100;

    }


}
