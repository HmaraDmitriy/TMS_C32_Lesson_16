package com.teachmeskills.lesson_16;

/*Создать коллекцию номеров паспортов (формат String).
Создать коллекцию студентов нашей группы.
В каждой коллекции не должно быть повторяющихся элементов.
Создать коллекцию ключ-значение, где ключом будет номер паспорта из первой коллекции,
а значением будет объект класса Student из второй коллекции.
Пройти циклом for-each по коллекции ключ-значение и вывести элементы коллекции на экран.*/

import com.teachmeskills.lesson_16.indication.PasNum;
import com.teachmeskills.lesson_16.members.Student;

import java.util.*;


public class Runner {
    public static void main(String[] args) {

        Set<PasNum> passports = new LinkedHashSet<>(Set.of(
                new PasNum("PB275726"),
                new PasNum("PB863538"),
                new PasNum("AP573834"),
                new PasNum("PB836376"),
                new PasNum("PB459876"),
                new PasNum("CF658935"),
                new PasNum("PB987643"),
                new PasNum("PB437476")));


        Set<Student> students = new LinkedHashSet<>(Set.of(
                new Student("Andreich", 1, "m", "Teacher"),
                new Student("Dmitriy", 2, "m", "Student"),
                new Student("Ilya", 3, "m", "Student"),
                new Student("Flame", 4, "m", "Student"),
                new Student("Igor", 5, "m", "Student"),
                new Student("Marina", 6, "w", "Student"),
                new Student("Daniil", 7, "m", "Student"),
                new Student("Sultan", 8, "m", "Student")));


        Map<PasNum, Student> passportStudent = new LinkedHashMap<>();
        Iterator<PasNum> passportIterator = passports.iterator();
        Iterator<Student> studentIterator = students.iterator();

        while (passportIterator.hasNext() && studentIterator.hasNext()) {
            passportStudent.put(passportIterator.next(), studentIterator.next());
        }

        for (Map.Entry<PasNum, Student> map : passportStudent.entrySet()) {
            System.out.println("Passport: " + map.getKey() + " + Student: " + map.getValue());
        }
    }
}
