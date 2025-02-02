package com.daewon.xeno_z1.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductsStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment와 같은
    private long productStockId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productColorSizeId", referencedColumnName = "productColorSizeId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ProductsColorSize productsColorSize;

    private long stock;

}