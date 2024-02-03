public class R_10Flower {

        String name;
        int petel;
        float price;

        public R_10Flower(String name, int petel, float price) {
            this.name = name;
            this.petel = petel;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPetel() {
            return petel;
        }

        public void setPetel(int petel) {
            this.petel = petel;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "R_10Flower{" +
                    "name='" + name + '\'' +
                    ", petel=" + petel +
                    ", price=" + price +
                    '}';
        }

        public static void main(String[] args) {
            R_10Flower flower8=new R_10Flower("Jory",5, 100);
            System.out.println(flower8.toString());

        }
    }


