package main;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        View view = new View();
        List<Member> family = new ArrayList<>();
        family.add(new Member("아빠"));
        family.add(new Member("엄마"));
        family.add(new Member("나"));
        family.add(new Member("동생"));

        for (Member member : family) {
            view.inputAbsentDays(member);
        }

        view.printFamilyAbsentDays(family);
    }
}