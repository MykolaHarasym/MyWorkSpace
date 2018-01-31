package CoffePoint;


    public class Coffee {
        private String coffeeName;
        private String milk;
        private String chocolate;
        private String cream;
        private double price;

        public Coffee(String coffeeName, String milk, String chocolate, String cream, double price) {
            this.coffeeName = coffeeName;
            this.milk = milk;
            this.chocolate = chocolate;
            this.cream = cream;
            this.price = price;
        }

        public Coffee(String coffeeName, String milk, String chocolate, double price) {
            this.coffeeName = coffeeName;
            this.milk = milk;
            this.chocolate = chocolate;
            this.price = price;
        }

        public Coffee(String coffeeName, String milk, double price) {
            this.coffeeName = coffeeName;
            this.milk = milk;
            this.price = price;
        }

        public Coffee(String coffeeName, double price) {
            this.coffeeName = coffeeName;
            this.price = price;
        }

        public String getCoffeeName() {

            return coffeeName;
        }

        public void setCoffeeName(String coffeeName) {
            this.coffeeName = coffeeName;
        }

        public String getMilk() {
            return milk;
        }

        public void setMilk(String milk) {
            this.milk = milk;
        }

        public String getChocolate() {
            return chocolate;
        }

        public void setChocolate(String chocolate) {
            this.chocolate = chocolate;
        }

        public String getCream() {
            return cream;
        }

        public void setCream(String cream) {
            this.cream = cream;
        }
    }


