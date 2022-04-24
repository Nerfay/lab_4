package com.company;

public class Main {

    public static void main(String[] args) {
        basic();
        advanced();
    }
    /**
     * Продавец
     * Наименование
     * Количество
     * Цена
     * Дата продажи
     *
     * Определить количество товаров, проданных
     * продавцом «Иванов», вывести сведения о них и
     * определить товар с максимальной стоимостью.
     */
    public static void basic () {
        final Product product1 = new Product ("Ivanov","item1",20,9999.99,2018 ,8,15 );
        final Product product2 = new Product ("Ivanov","item3",35,5699.99,2017 ,8,30);
        final Product product3 = new Product ("Ivanov","item4",5,3999.99,2019 ,4,18);
        final Product product4 = new Product ("Kabakov","item2",17,7999.99,2015 ,7,17);
        final Product product5 = new Product ("Kabakov","item3",48,5699.99,2017 ,2,20);
        final Product product6 = new Product ("Kabakov","item4",10,3999.99,2019 ,4,18);
        final Product product7 = new Product ("Tabakov","item1",23,9999.99,2015 ,7,17);
        final Product product8 = new Product ("Tabakov","item2",35,7999.99,2017 ,2,20);
        final Product product9 = new Product ("Tabakov","item3",107,5699.99,2019 ,4,18);
        System.out.println();

        final Products products = new Products(9);
        products.addProduct(product1);
        products.addProduct(product2);
        products.addProduct(product3);
        products.addProduct(product4);
        products.addProduct(product5);
        products.addProduct(product6);
        products.addProduct(product7);
        products.addProduct(product8);
        products.addProduct(product9);
        System.out.println("Basic:"+"\n");
        System.out.println(products);
        System.out.println();
        System.out.println("MaxPriceWhoSellIvanov:");
        products.findAmountSellIvanov();
        System.out.println("MaxPriceWhoSellIvanov:");
        System.out.println(products.findAmountSellIvanovMaxPrice());
    }

    /**
     * Фамилия
     * Имя
     * Отчество
     * Должность
     * Зарплата
     * Дата рождения
     *
     * Вывести данные о самом молодом сотруднике.
     */
    public static void advanced () {
        final Collaborator collaborator1 = new Collaborator ("Ivan","Ivanov","Ivanovich",Position.Administrator,70000,2000 ,12,10 );
        final Collaborator collaborator2 = new Collaborator ("Tabakov","Danya","Danilovich",Position.Boss,110000,1980 ,11,10);
        final Collaborator collaborator3 = new Collaborator ("Ivanov","Kirill","Evgenevich",Position.Newbie,10000,2004 ,3,12);
        final Collaborator collaborator4 = new Collaborator ("Petrykov","Denis","Petrovich",Position.Manager,30000,1993 ,4,25);
        System.out.println();

        final Collaborators collaborators = new Collaborators(4);
        collaborators.addCollaborator(collaborator1);
        collaborators.addCollaborator(collaborator2);
        collaborators.addCollaborator(collaborator3);
        collaborators.addCollaborator(collaborator4);
        System.out.println("Advanced:"+"\n");
        System.out.println(collaborators);
        System.out.println();
        System.out.println(collaborators.findНoungerCollaborator());
    }
}
