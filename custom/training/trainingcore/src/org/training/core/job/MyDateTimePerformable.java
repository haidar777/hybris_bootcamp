package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import org.apache.log4j.Logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateTimePerformable extends AbstractJobPerformable<CronJobModel> {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private static final Logger LOG = Logger.getLogger(MyJobPerformable.class);

    @Override
    public PerformResult perform(final CronJobModel cronJobModel) {
        LocalDateTime now = LocalDateTime.now();
        LOG.info(DTF.format(now));
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
