/*
    Copyright (c) $today.year The Culture Trip Inc. All rights reserved.
    This source file can not be copied and/or distributed without the express
    written permission of The Culture Trip Inc. Any unauthorized use is subject to criminal prosecution.
*/

package com.maneva.redis.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    Created by IntelliJ IDEA.
    @author Created by Maneva.
    @since 25.1.23.
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product implements Serializable {

    @Id
    private int id;

    private String name;

    private int qty;

    private long price;
}
