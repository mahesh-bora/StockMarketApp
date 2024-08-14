package com.plcoding.stockmarketapp.data.repository

import com.plcoding.stockmarketapp.data.local.StockDatabase
import com.plcoding.stockmarketapp.data.remote.dto.StockAPI
import com.plcoding.stockmarketapp.domain.model.CompanyListing
import com.plcoding.stockmarketapp.domain.repository.StockRepository
import com.plcoding.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StockRepoImpl @Inject constructor(
    val api: StockAPI,
    val db: StockDatabase
): StockRepository {
    override suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): kotlinx.coroutines.flow.Flow<Resource<List<CompanyListing>>> {
        return flow{
            emit(Resource.Loading(true))
        }
    }
}