package com.tsypk.coreclient.api.feign.dto.macbook

import com.fasterxml.jackson.annotation.JsonProperty
import recognitioncommons.models.Money
import recognitioncommons.models.country.Country

data class MacbookFindBestResponseMacbookDto(
    @field:JsonProperty("id", required = true) val id: String,
    @field:JsonProperty("supplierId", required = true) val supplierId: Long,
    @field:JsonProperty("country", required = true) val country: Country,
    @field:JsonProperty("money", required = true) val money: Money,
)