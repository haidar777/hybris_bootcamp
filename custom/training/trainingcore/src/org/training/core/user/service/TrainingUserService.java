package org.training.core.user.service;

import org.training.facades.product.data.UserData;

public interface TrainingUserService {
    public UserData getUserByEmail(String email);
}
