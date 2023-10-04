public class Main {
    public static void main(String[] args) {
        List list = new List();
        System.out.println("Изначальный список:");//тесты
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.print();
        System.out.println();
        System.out.println("Добавим в начало 5:");
        list.addFirst(5);
        list.print();
        System.out.println();
        System.out.println("Добавим в конец 8:");
        list.addLast(8);
        list.print();
        System.out.println();
        System.out.println("Добавим на 3е место 4:");
        list.addByInd(4,2);
        list.print();
        System.out.println();
        System.out.println("Удалим из предыдущего списка  первый эл-т:");
        list.removeFirst();
        list.print();
        System.out.println();
        System.out.println("Удалим последний эл-т из предыдущего списка:");
        list.removeLast();
        list.print();
        System.out.println();
        System.out.println("Удалим из предыдущего списка 1:");
        list.removeAt(1);
        list.print();
        System.out.println();
        System.out.println("Удалим из предыдущего списка 4:");
        list.removeAt(4);
        list.print();

    }
}