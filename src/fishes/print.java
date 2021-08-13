package fishes;



public class print {
    public static void main(String[] args) {
        Salmon salmon = new Salmon(30);
        int salmonPrice = salmon.price;
        boolean salmonIsInSushi = salmon.isInSushi;
        System.out.println(salmonIsInSushi + " " + salmonPrice);

        Tuna tuna = new Tuna(30, false);
    }
}
