package ru.habrahabr.arlidor.lessons28;

import java.util.Objects;

public class MiniCar extends Car {

    private String mark;

    public MiniCar(String name, String mark) {
        super(name);
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.mark);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MiniCar other = (MiniCar) obj;
        if (!Objects.equals(this.mark, other.mark)) {
            return false;
        }
        return true;
    }

   

}
