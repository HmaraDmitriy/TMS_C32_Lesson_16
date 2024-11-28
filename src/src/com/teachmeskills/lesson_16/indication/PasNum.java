package com.teachmeskills.lesson_16.indication;


import java.util.Objects;

public class PasNum {

    private String num;

    public PasNum(String num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasNum pasNum = (PasNum) o;
        return Objects.equals(num, pasNum.num);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(num);
    }

    @Override
    public String toString() {
        return "PasNum{" +
                "num='" + num + '\'' +
                '}';
    }
}
