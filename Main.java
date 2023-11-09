package dz12;
/*Д/з Расширим предыдущую задачу.
Замерить время добавления, поиска и удаления объектов из коллекции в LinkedList, ArrayList, TreeSet, HashSet.
Сравнить время и сделать вывод о том, в каких условиях какая коллекция работает быстрее.*/


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Object> linkedList = new LinkedList<>();
        List<Object> arrayList = new ArrayList<>();
        TreeSet<Object> treeSet = new TreeSet<>();
        HashSet<Object> hashSet = new HashSet<>();

        //System.out.println(addElements(linkedList) - addElements(arrayList));
        System.out.println(addElementLinkedList((LinkedList<Object>) linkedList) - addElemArrayList((ArrayList<Object>) arrayList));
        System.out.println(addElementLinkedList((LinkedList<Object>) linkedList) - addElementHashSet(hashSet));
        System.out.println(addElementLinkedList((LinkedList<Object>) linkedList) - addElementTreeSet(treeSet));
        System.out.println(addElementHashSet(hashSet) - addElementTreeSet(treeSet));

        System.out.println("______________");

        System.out.println(getElementLinkedList((LinkedList<Object>) linkedList) - getElementArrayList((ArrayList<Object>) arrayList));
        System.out.println(getElementLinkedList((LinkedList<Object>) linkedList) - getElementHashSet(hashSet));
        System.out.println(getElementLinkedList((LinkedList<Object>) linkedList) - getElementTreeSet(treeSet));
        System.out.println(getElementHashSet(hashSet) - getElementTreeSet(treeSet));

        System.out.println("______________");

        System.out.println(removeElementLinkedList((LinkedList<Object>) linkedList) - removeElementArrayList((ArrayList<Object>) arrayList));
        System.out.println(removeElementLinkedList((LinkedList<Object>) linkedList) - removeElementHashSet(hashSet));
        System.out.println(removeElementLinkedList((LinkedList<Object>) linkedList) - removeElementTreeSet(treeSet));
        System.out.println(removeElementHashSet(hashSet) - removeElementTreeSet(treeSet));

    }

    public static long addElements(List<Object> list) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            list.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElementLinkedList(LinkedList<Object> linkedList) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            linkedList.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long getElementLinkedList(LinkedList<Object> linkedList) {
        long time = System.currentTimeMillis();
        linkedList.get(3);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long removeElementLinkedList(LinkedList<Object> linkedList) {
        long time = System.currentTimeMillis();
        linkedList.remove(499000);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElemArrayList(ArrayList<Object> arrayList) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long getElementArrayList(ArrayList<Object> arrayList) {
        long time = System.currentTimeMillis();
        arrayList.get(3);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long removeElementArrayList(ArrayList<Object> arrayList) {
        long time = System.currentTimeMillis();
        arrayList.remove(499000);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElementTreeSet(TreeSet<Object> treeSet) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            treeSet.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long getElementTreeSet(TreeSet<Object> treeSet) {
        long time = System.currentTimeMillis();
        treeSet.getTreeSet(3);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long removeElementTreeSet(TreeSet<Object> treeSet) {
        long time = System.currentTimeMillis();
        treeSet.remove(499000);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long addElementHashSet(HashSet<Object> hashSet) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < 500_000; i++) {
            hashSet.add(new Object());
        }
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long getElementHashSet(HashSet<Object> hashSet) {
        long time = System.currentTimeMillis();
        hashSet.getHashset(3);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }

    public static long removeElementHashSet(HashSet<Object> hashSet) {
        long time = System.currentTimeMillis();
        hashSet.remove(499000);
        long time1 = System.currentTimeMillis();
        time = time1 - time;
        return time;
    }
}
