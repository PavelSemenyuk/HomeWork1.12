public class HomeWork {
    public static void main(String[] args) {
        Avthor avthor1 = new Avthor("Михаил ", "Булгаков");
        Avthor avthor2 = new Avthor("Айн ","Рэнд");


        Book book1 =  new Book("Мастер и Маргорита", 1928, avthor1);
        Book book2 = new Book("Атлант расправил плечи", 1957, avthor2);

        System.out.println("Название книги = " + book1.getName());
        System.out.println("Год публикации = " + book1.getDate());
        System.out.println("Автор = " +  avthor1.getNameAvthor() + avthor1.getSurname());

        book1.setDate(1956);
        System.out.println("Год переиздания = " + book1.getDate());


        System.out.println();


        System.out.println("Название книги = " + book2.getName());
        System.out.println("Год публикации = " + book2.getDate());
        System.out.println("Автор = " + avthor2.getNameAvthor() + avthor2.getSurname());

        book2.setDate(1988);
        System.out.println("Год переиздания = " + book2.getDate());


    }
}
