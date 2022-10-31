public class DiscountsOnShirts {
    public static void main(String[] args) {

        final int priceOneShirt = 1000;
        System.out.println("Цена одной рубашки без скидки: " + priceOneShirt + " рублей");

        final int numberOnSelectedShirt = 4;
        System.out.println("Количество выбранных рубашек: " + numberOnSelectedShirt);

        final int numderOfShitrtForDiscount = 6;
        System.out.println("Количество рубашек для получения скидки: " + numderOfShitrtForDiscount);

        final int lackOfShirtForDiscount = numderOfShitrtForDiscount - numberOnSelectedShirt;
        System.out.println("Не хватает для получения скидки: " + lackOfShirtForDiscount + " рубашек");

        final int priceOnSelectedShirts = priceOneShirt * numberOnSelectedShirt;
        System.out.println("Цена выбранных рубашек без скидки: " + priceOnSelectedShirts + " рублей");

        final int priceLaskOfShirtForDiscount = lackOfShirtForDiscount * priceOneShirt;
        System.out.println("Не хватает " + priceLaskOfShirtForDiscount + " рублей для получения скидки");

        final double percentForDiscount = 0.1;
        System.out.println("Скидка " + percentForDiscount * 100 + " %");

        final double priceForDiscount = (priceOneShirt * numderOfShitrtForDiscount) - (priceOneShirt * numderOfShitrtForDiscount * percentForDiscount);
        System.out.println("Цена рубашек с учетом скидки: " + priceForDiscount + " рублей");

        final double priceOneShirtDiscount = priceForDiscount / numderOfShitrtForDiscount;
        System.out.println("Цена одной рубашки со скидкой: " + priceOneShirtDiscount + " рублей");

        final double savedMoney = (priceOneShirt * numderOfShitrtForDiscount) - priceForDiscount;
        System.out.println("Шесть рубашек со скидкой дешевле на " + savedMoney + " рублей, чем шесть рубашек без скидки");

        final double freeShirt = savedMoney / priceOneShirt;
        System.out.println(freeShirt + " рубашек вы получите на халяву");

    }
}
