public class Product {
    String name;
    Double weight;
    int expireday;
    int expiremonth;
    int expireyear;



    public Product(String name, Double weight,int expireday,int expiremonth,int expireyear) {
        this.name = name;
        this.weight = weight;
        this.expireday = expireday;
        this.expiremonth = expiremonth;
        this.expireyear = expireyear;
    }
    void print(){
        System.out.println("PRODUCT " + name + " KG: " + weight + " EXPIRE: " + expireday +"/"+ expiremonth +"/"+ expireyear);
    }
}
