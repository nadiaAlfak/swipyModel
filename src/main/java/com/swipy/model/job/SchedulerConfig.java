
import org.quartz.Trigger;
import org.quartz.spi.JobFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.boot.autoconfigure.quartz.QuartzProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;

import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

import java.io.IOException;
import java.util.Properties;

@Configuration
public class SchedulerConfig {

    final
    QuartzProperties quartzProperties;

    public SchedulerConfig(QuartzProperties quartzProperties) {
        this.quartzProperties = quartzProperties;
    }

    @Bean
    @Qualifier("trigger")
    public SimpleTriggerFactoryBean trigger(@Qualifier("jobDetail") JobDetail jobDetail) {
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setRepeatInterval(3000);
        factoryBean.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        return factoryBean;
    }

    @Bean
    @Qualifier("jobDetail")
    public JobDetailFactoryBean jobDetail() {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        //TODO: need to have a n executer class. so i can use it for interval calls.
        //factoryBean.setJobClass(JobExecuter.class);
        factoryBean.setDurability(true);
        return factoryBean;
    }

    @Bean
    @Qualifier("jobFactory")
    public JobFactory jobFactory(ApplicationContext applicationContext) {
        SpringBeanJobFactory jobFactory = new SpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    @Qualifier("QuartzProperties")
    public Properties QuartzProperties() throws IOException {
        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
        propertiesFactoryBean.afterPropertiesSet();
        return propertiesFactoryBean.getObject();
    }

    @Bean
    @Qualifier("schedulerFactoryBean")
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory,
                                                     @Qualifier("trigger") Trigger trigger) throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        factory.setJobFactory(jobFactory);
        factory.setQuartzProperties(QuartzProperties());
        factory.setTriggers(trigger);
        return factory;
    }
}