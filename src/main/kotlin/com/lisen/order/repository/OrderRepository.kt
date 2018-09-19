package com.lisen.order.repository

import com.lisen.order.entity.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *
 *
 * @author   lisen
 * @create   2018-09-19 下午1:59
 *
 **/

@Repository
interface OrderRepository : JpaRepository<Order, Int> {



}