package com.market.query.bonus

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.market.data.Bonus
import org.springframework.stereotype.Component

@Component
class BonusQuery(): GraphQLQueryResolver {
    val list = arrayListOf<Bonus>()

    fun getBonus(): List<Bonus> {
        LongRange(1, 20).forEach {
            list.add(
                Bonus(
                    it,
                    "name:$it",
                    "ratio:$it",
                    "announcement:$it",
                    "record:$it",
                    "exBonus:$it"
                )
            )
        }
        val length = list.size.also { println("Bonus size is $it") }
        println("length is :$length" )
        return list;
    }
}