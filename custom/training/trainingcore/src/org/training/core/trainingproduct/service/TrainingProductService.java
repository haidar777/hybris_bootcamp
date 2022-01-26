package org.training.core.trainingproduct.service;

import org.training.facades.product.data.ProductData;

public interface TrainingProductService {
    ProductData getProductDataByID(String id);
}
