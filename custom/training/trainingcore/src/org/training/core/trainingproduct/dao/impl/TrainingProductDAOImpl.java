package org.training.core.trainingproduct.dao.impl;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.trainingproduct.dao.TrainingProductDAO;

import javax.annotation.Resource;

public class TrainingProductDAOImpl implements TrainingProductDAO {

    private static final String QUERY_TRAINING_PRODUCT = "SELECT {*} FROM {Product} WHERE {code} LIKE ";

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public UserModel getProductDataByID(String id) {
        final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(QUERY_TRAINING_PRODUCT);
        final SearchResult<UserModel> products = flexibleSearchService.search(flexibleSearchQuery);
        return products.getResult().get(0);
    }
}
