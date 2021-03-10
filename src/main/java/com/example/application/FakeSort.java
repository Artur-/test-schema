package com.example.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.data.domain.Sort;

public class FakeSort extends Sort {
    private List<FakeOrder> orders;

    protected FakeSort() {
        super(new ArrayList<>());
    }

    protected FakeSort(List<FakeOrder> orders) {
        this();
        this.orders = orders;
    }

    @Override
    public boolean isSorted() {
        return !orders.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.orders.iterator();
    }

    public List<FakeOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<FakeOrder> orders) {
        this.orders = orders;
    }
}
