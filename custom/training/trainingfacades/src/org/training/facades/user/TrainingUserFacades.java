package org.training.facades.user;

import org.training.facades.product.data.UserData;

public interface TrainingUserFacades {
    UserData getUserByEmail(String email);
}
