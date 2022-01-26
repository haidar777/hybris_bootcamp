package org.training.core.user.dao;

import de.hybris.platform.core.model.user.UserModel;

public interface TrainingUserDAO {
    UserModel getUserByEmail(String email);
}
