package main;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;

    private List<Integer> absentDays;

    public Member() {
        absentDays = new ArrayList<>();
    }

    public Member(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getAbsentDays() {
        return absentDays;
    }

    public void setAbsentDays(List<Integer> absentDays) {
        this.absentDays = absentDays;
    }
}
