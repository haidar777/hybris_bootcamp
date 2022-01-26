package org.training.core.user.dao.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.user.dao.TrainingUserDAO;

import javax.annotation.Resource;

public class TrainingUserDAOImpl implements TrainingUserDAO {

    private static final String QUERY_TRAINING_USER = "SELECT {NAME} FROM {USER} WHERE {UID} = 'haidaraide@gmail.com'";

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public UserModel getUserByEmail(String email) {
        final FlexibleSearchQuery flexibleSearch = new FlexibleSearchQuery(QUERY_TRAINING_USER);
        final SearchResult<UserModel> users = flexibleSearchService.search(flexibleSearch);
        return users.getResult().get(0);
    }
}
