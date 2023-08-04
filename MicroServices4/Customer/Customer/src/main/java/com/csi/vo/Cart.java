package com.csi.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cart {

    private int cartId;

    private String cartAddress;

    private String cartName;

}
