package school;

import java.util.Arrays;
import java.util.StringJoiner;

public class Student implements Comparable<Student> {
    private final int id;
    private String name;
    private double allowance;
    private static Student[] all;
    private static int count;

    public Student(int id, String name, double allowance) {
        if (id > 0 && name != null && allowance > 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        for (int i = 0; i < count; i++) {
            if (all[i].id == id)
                throw new IllegalArgumentException("This id already exists");
        }
        this.id = id;
        this.name = name;
        this.allowance = allowance;
        if (all == null)
            all = new Student[2];
        if (all.length == count) {
            all = Arrays.copyOf(all, all.length << 1);
        }
        all[count++] = this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAllowance() {
        return allowance;
    }
    public boolean equals(Student obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student(");
        sb.append(this.id);
        sb.append(",");
        sb.append(this.name);
        sb.append(",");
        sb.append(this.allowance);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return id - o.id;
    }

    public static double averageAllowance() {
        if (count == 0) return -1.0;
        double sum = 0;
        for (int i=0; i<count; i++) {
            sum += all[i].allowance;
        }
        return sum / count;
    }

    public static Student remove(int id) {
        for (int i=0; i<count; i++) {
            if (all[i].id == id) {
                var temp = all[i];
                all[i] = all[--count];
                all[count] = null;
                return temp;
            }
        }
        return null;
    }

    public static void sort() {
        Arrays.sort(all, 0, count);
    }

    public static String listAll() {
        var s = new StringJoiner(": ");
        for (int i=0; i<count; i++) {
            s.add(all[i].toString());
        }
        return s.toString();
    }
}