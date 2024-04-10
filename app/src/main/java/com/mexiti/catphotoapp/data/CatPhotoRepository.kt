package com.mexiti.catphotoapp.data

import com.mexiti.catphotoapp.model.CatPhoto
import com.mexiti.catphotoapp.network.CatApi

interface CatPhotoRepository{
    suspend fun  getCatPhotos():List<CatPhoto>
}

class NetWorkCatPhotoRepository: CatPhotoRepository{
    override suspend fun getCatPhotos(): List<CatPhoto> {
        return CatApi.retrofitService.getPhotos()
    }
}