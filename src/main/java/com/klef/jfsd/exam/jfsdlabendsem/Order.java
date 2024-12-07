package com.klef.jfsd.exam.jfsdlabendsem;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private String productName;

    private Integer quantity;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private String customerName;

    // Getters and Setters
}
