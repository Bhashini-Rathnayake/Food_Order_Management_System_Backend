package com.example.hotel.model.dto;

public class DashboradDTO {
    private Integer orderCount;
    private Integer productCount;
    private double totalRevenue;

    public DashboradDTO() {
    }

    public DashboradDTO(Integer orderCount, Integer productCount, Integer totalRevenue) {
        this.orderCount = orderCount;
        this.productCount = productCount;
        this.totalRevenue = totalRevenue;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
    }
}
