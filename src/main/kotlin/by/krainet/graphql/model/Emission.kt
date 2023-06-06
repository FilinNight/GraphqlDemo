package by.krainet.graphql.model

import java.math.BigDecimal

class Emission(
        val id: Long,
        val company: Company,
        val emissionType: EmissionType,
        val marketType: MarketType,
        var factor: Double,
        var product: ProductType,
        var symbol: String,
        var status: EmissionStatusType,
        var rate: Double
)

enum class EmissionType {
    placement, circulation, repayment
}

enum class MarketType {
    stock, otc
}

enum class EmissionStatusType {
    INACTIVE, ACTIVE, REGISTRY_COLLECTION
}

enum class ProductType {
    bond, equity
}