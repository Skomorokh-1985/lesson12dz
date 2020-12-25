package zadachi_str_274;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main (String [] args) {

        LinkedList <Student> students = new LinkedList <Student> ();
        students.addLast(new Student(1, "Иванов"));
        students.addLast(new Student(2, "Петров"));
        students.addLast(new Student(3, "Сидоров"));
        students.addLast(new Student(4, "Семенов"));
        students.addLast(new Student(5, "Федоров"));
        students.addLast(new Student(1, "Николаев"));
        students.addLast(new Student(2, "Сергеев"));
        students.addLast(new Student(3, "Серов"));
        students.addLast(new Student(4, "Чехов"));
        students.addLast(new Student(5, "Пупкин"));

        LinkedList <Student> students2 = new LinkedList <Student> ();
        students2.addLast(new Student(1, "Сигурсон"));
        students2.addLast(new Student(2, "Магнусон"));
        students2.addLast(new Student(3, "Ёхансон"));
        students2.addLast(new Student(4, "Ёкерсон"));
        students2.addLast(new Student(5, "Пупкинсон"));

        LinkedList <Student> students3 = new LinkedList <Student> ();
        students3.addLast(new Student(1, "Иванович"));
        students3.addLast(new Student(2, "Петкович"));
        students3.addLast(new Student(3, "Влашич"));
        students3.addLast(new Student(4, "Манчич"));
        students3.addLast(new Student(5, "Пупчич"));

        printStudents (students,3);

        System.out.println("\n\n====================== Объединение LinkedList-ов ======================");
        LinkedList <Student> students4 = union (students2, students3);
        printStudents (students4);

        System.out.println("\n\n====================== Пересечение LinkedList-ов ======================");
        LinkedList <Student> students5= intersect (students2, students3);
        printStudents (students5);

        LinkedList <Student> students6 = new LinkedList <Student> ();
        students6.addLast(new Student(5, "ВВВ"));
        students6.addLast(new Student(3, "БББ"));
        students6.addLast(new Student(4, "ААА"));
        students6.addLast(new Student(1, "ГГГ"));
        students6.addLast(new Student(2, "ДДД"));

        System.out.println("\n\n============== Реализация сортировки с помощью compareTo =================");
        Collections.sort(students6);
        printStudents (students6);

        System.out.println("\n\n============== проверка реализации compareTo с помощью TreeSet и аналогичных данных =================");
        LinkedList <Student> students7 = new LinkedList <Student> ();
        students7.addLast(new Student(5, "ВВВ"));
        students7.addLast(new Student(3, "БББ"));
        students7.addLast(new Student(4, "ААА"));
        students7.addLast(new Student(1, "ГГГ"));
        students7.addLast(new Student(2, "ДДД"));

        TreeSet <Student> tSS = new TreeSet<>(students7);
        System.out.println(tSS);

    }

    public static void printStudents (LinkedList <Student> students, int course) {
        System.out.println("\nСтуденты " + course + "\t курса: ");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student stud = iter.next();
            if (stud.getCourse() == course) {
                System.out.println(stud.getName());
            }
        }
    }

    public static void printStudents (LinkedList <Student> students) {
        System.out.println("\n Все студенты: ");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student stud = iter.next();
            System.out.println("Студент - " + stud.getName() + "\t , курс - "  + stud.getCourse());
        }
    }

    public static <E> LinkedList<E> union (LinkedList <E> set2, LinkedList <E> set3) {
        Iterator<E> iter2 = set2.iterator();
        Iterator<E> iter3 = set3.iterator();
        LinkedList<E> finList = new LinkedList<E>();
        while (iter2.hasNext()) {
            finList.add(iter2.next());
        }
        while (iter3.hasNext()) {
            finList.add(iter3.next());
        }
        return finList;
    }

    public static <E> LinkedList<E> intersect (LinkedList <E> set1, LinkedList <E> set2) {
        Iterator<E> iter1 = set1.iterator();
        Iterator<E> iter2 = set2.iterator();
        LinkedList <E> finList = new LinkedList <E> ();
        while (iter1.hasNext() || iter2.hasNext()) {
            finList.add(iter1.next());
            finList.add(iter2.next());
            }
        return finList;
    }

}

