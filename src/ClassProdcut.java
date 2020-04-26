class ClassProdcut {
    public static void main(String[] args){

    Product p1 = new Product("Iphone/black " + " ",2500.00,3);

        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getQty());

        System.out.println();

    Product p2 = p1 ;


        p2.setName("Iphone/gold");
        p2.setPrice(1500.00);
        p2.setQty(6);


        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getQty());

        System.out.println();

        Product p3 = new Product("Nokia",99.00,1) ;


        System.out.println(p3.getName());
        System.out.println(p3.getPrice());
        System.out.println(p3.getQty());


    }


   static  class Product {
        private String name;
        private Double price;
        private Integer qty;

        public Product(String name, Double price, Integer qty) {
            setName(name);
            setPrice(price);
            setQty(qty);
        }


        public String getName(){
            return name;
        }

        public void setName(String name){
            if (name.length()>=6 && name.length()<=20){
                this.name =name;
            }else
            {
                System.err.println("Error");
            }
        }

        public Double getPrice(){
            return price;
        }

        public void setPrice(Double price){
            if(price >= 100 && price <= 10000){
                this.price = price;
            }else{
                System.err.println("Error");
            }
        }

    public Integer getQty(){
            return qty;
    }
    public void setQty(Integer qty){
            if(qty >= 2 && qty <= 10){
                this.qty = qty;
            }
            else {
                System.err.println("Error");
            }
    }

    }


}
