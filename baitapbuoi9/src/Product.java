public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, String description,int quantity,int price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product: (" +
                "id: " + id +
                ", Tên sản phẩm  : " + name +
                ", Mô tả :  " + description +
                ", Số lượng :  " + quantity +
                ", Giá bán :  " + price +"  "
                ;
    }
}
