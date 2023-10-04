public class Node {
    public int data;
    public Node next;//ссылка на следующий элемент
    public Node prev;//ссылка на предыдущий эл-т

    public Node(int data){//конструктор для создания нового узла с определенным значением данных
        this.data = data;
    }
}
