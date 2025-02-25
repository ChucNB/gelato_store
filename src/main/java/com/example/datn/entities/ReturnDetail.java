package com.example.datn.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "return_detail")
public class ReturnDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Số lượng đổi
    private Integer quantityReturn;

    //Giá đổi
    private Double momentPriceRefund;

    @ManyToOne
    @JoinColumn(name = "return_id")
    private BillReturn billReturn;

//    @ManyToOne
//    @JoinColumn(name = "old_product_detail_id")
//    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "product_detail_id")
    private ProductDetail productDetail;
}
