// Inheritance

package com.github.kabraxis.oop.my_work.inheritance.company;

import java.util.Date;

public class Employee extends Person {
    protected Date startDate;
    protected long salary;

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return this.salary;
    }

}
