package org.training.core.trainingproduct.service.impl;

import de.hybris.platform.core.model.user.UserModel;
import org.training.core.trainingproduct.dao.TrainingProductDAO;
import org.training.core.trainingproduct.service.TrainingProductService;
import org.training.facades.product.data.ProductData;

import javax.annotation.Resource;

public class TrainingProductServiceImpl implements TrainingProductService {

    @Resource
    private TrainingProductDAO trainingProductDAO;

    @Override
    public ProductData getProductDataByID(String id) {
        UserModel userModel = trainingProductDAO.getProductDataByID(id);
        return null;
    }
}
