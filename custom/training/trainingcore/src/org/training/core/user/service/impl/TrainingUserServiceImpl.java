package org.training.core.user.service.impl;

import de.hybris.platform.core.model.user.UserModel;
import org.training.core.user.dao.TrainingUserDAO;
import org.training.core.user.service.TrainingUserService;
import org.training.facades.product.data.UserData;

import javax.annotation.Resource;

public class TrainingUserServiceImpl implements TrainingUserService {

    @Resource
    private TrainingUserDAO trainingUserDAO;

    @Override
    public UserData getUserByEmail(String email) {
        UserModel userModel= trainingUserDAO.getUserByEmail(email);
        UserData userData = new UserData();
        return userData;
    }
}
