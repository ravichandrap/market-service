package com.market.mutation.dividend

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.market.data.Dividend
import org.springframework.stereotype.Component

@Component
class DividendMutation: GraphQLMutationResolver {
    fun emailDividend(email: String, dividends: List<Dividend>): String {
            println(email)
        dividends.forEach{ println(it.toString())}
        return ""
    }
}