package by.krainet.graphql.controller

import by.krainet.graphql.model.Emission
import by.krainet.graphql.service.EmissionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class EmissionQuery {

    @Autowired
    private lateinit var emissionService: EmissionService

    @QueryMapping
    fun getAllEmissions(): List<Emission> {
        return emissionService.getAll()
    }

    @QueryMapping
    fun getEmissionById(@Argument id: Int): Emission? {
        return emissionService.getById(id.toLong())
    }
}