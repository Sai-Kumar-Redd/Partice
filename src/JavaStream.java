import java.util.*;



 class Product {
    String name;
    int id;
    double Price;


    public Product(String name, int id, double price) {
        this.name = name;
        this.id = id;
        Price = price;
    }
}
class JavaStream{
    public static void  main(String[]args){
        List<Product> p=new ArrayList<Product>();
        p.add(new Product("Hp",4,80000));
        p.add(new Product("Dell",1,40000));
        p.add(new Product("Apple",2,100000));
        p.add(new Product("Mac",3,70000));
        List<Double>ProductList=new ArrayList<Double>();
        for(Product Product:p){
            if(Product.Price>70000) {
                ProductList.add(Product.Price);
            }



            }
        System.out.println(ProductList);

        }




    }







