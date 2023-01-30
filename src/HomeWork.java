public class HomeWork {
    public static void main(String[] args) {
        Book masterM =  new Book("Мастер и Маргорита", 1928);
        System.out.println("Название книги = " + masterM.getName());
        System.out.println("Год публикации = " + masterM.getDate());
        masterM.setDate(1956);
        System.out.println("Год переиздания = " + masterM.getDate());

        Avthor bylgakov = new Avthor("Михаил ", "Булгаков");
        System.out.println("Имя автора = " + bylgakov.getNameAvtor() + bylgakov.getSurname());

        System.out.println();

        Book atlas = new Book("Атлант расправил плечи", 1957);
        System.out.println("Название книги = " + atlas.getName());
        System.out.println("Год публикации = " + atlas.getDate());
        atlas.setDate(1988);
        System.out.println("Год переиздания = " + atlas.getDate());

        Avthor aynRand = new Avthor("Айн ","Рэнд");
        System.out.println("Имя автора = " + aynRand.getNameAvtor() + aynRand.getSurname());

    }
}
