package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class View {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void inputAbsentDays(Member member) {
        List<Integer> absentDays = new ArrayList<>();
        System.out.println(member.getName() + "의 쉬는 날짜를 입력하세요.");

        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                absentDays.add(Integer.parseInt(st.nextToken()));
            }

        } catch (IOException e) { }

        member.setAbsentDays(absentDays);
    }

    public void printFamilyAbsentDays(List<Member> family) {
        for (Member member : family) {
            System.out.println(member.getName() + " : " + member.getAbsentDays());
        }
    }
}
