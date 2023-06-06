package by.krainet.graphql.service

import by.krainet.graphql.model.*
import org.springframework.stereotype.Service

@Service
class EmissionService {


    fun getById(id: Long): Emission? {
        return getAll().find { it.id == id }
    }

    fun getAll(): List<Emission> {
        return listOf(
                Emission(
                        id = 1,
                        emissionType = EmissionType.circulation,
                        marketType = MarketType.otc,
                        factor = 2.1,
                        rate = 7.09,
                        product = ProductType.bond,
                        symbol = "51329/MF-SB-BYN-0316",
                        status = EmissionStatusType.ACTIVE,
                        company = Company(2, "ООО Интемпо", "Общество с ограниченной ответственностью «Интемпо» было образовано в 2014 году в результате слияния группы компаний.")
                ),
                Emission(
                        id = 2,
                        emissionType = EmissionType.circulation,
                        marketType = MarketType.stock,
                        factor = 5.6,
                        rate = 2.0,
                        product = ProductType.bond,
                        symbol = "49224/5-200-02-4496",
                        status = EmissionStatusType.ACTIVE,
                        company = Company(1, "ООО СИ-трейдинг", "Компания предлагает облигации 39-го выпуска с дисконтом, позволяющим получить до 15% YTM.")
                ),
                Emission(
                        id = 3,
                        emissionType = EmissionType.placement,
                        marketType = MarketType.otc,
                        factor = 1.21,
                        rate = 1.5,
                        product = ProductType.equity,
                        symbol = "52015/5-200-01-15610",
                        status = EmissionStatusType.ACTIVE,
                        company = Company(3, "ОДО Байкал", "Общество с дополнительной ответственностью «Байкал» работает на рынке более 15 лет.")
                ),
                Emission(
                        id = 4,
                        emissionType = EmissionType.placement,
                        marketType = MarketType.stock,
                        factor = 7.2,
                        rate = 12.55,
                        product = ProductType.bond,
                        symbol = "9650/5-200-01-5056",
                        status = EmissionStatusType.INACTIVE,
                        company = Company(5, "ООО Агрофинанс", "Более 10 лет ООО Агрофинанс помогает белорусским фирмам, работающим в сфере с/х.")
                ),
                Emission(
                        id = 5,
                        emissionType = EmissionType.circulation,
                        marketType = MarketType.otc,
                        factor = 5.0,
                        rate = 10.1,
                        product = ProductType.equity,
                        symbol = "9649/3592",
                        status = EmissionStatusType.ACTIVE,
                        company = Company(4, "ООО Европейское аграрное агентство", "ООО «Европейское аграрное агентство» — поставщик современных решений в сфере сельского хозяйства.")
                )
        )
    }
}