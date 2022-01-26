package org.training.core.trainingproduct.dao;

import de.hybris.platform.core.model.user.UserModel;

public interface TrainingProductDAO {
    UserModel getProductDataByID(String id);
}
