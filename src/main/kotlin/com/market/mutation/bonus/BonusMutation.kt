package com.market.mutation.bonus

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.market.data.Bonus
import org.springframework.stereotype.Component

@Component
class BonusMutation(): GraphQLMutationResolver {
        fun saveBonus(name: String,
                         ratio: String,
                         announcement: String,
                         record: String,
                         exBonus: String): Bonus
                        = Bonus(1, name, ratio, announcement, record, exBonus)
}