package com.daewon.xeno_z1.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductOtherColorImagesDTO {

    private long productColorId;

    private byte[] productColorImage;

}
