package sopheria.notificationengine.config.smtp.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("smtp-configs")
public class SmtpConfigurationServiceImpl implements SmtpConfigurationService {

   @Autowired
    private SmtpConfigurationProperties smtpConfigurationProperties;

    @Override
    public SmtpConfig inquireSmtpConfiguration(String smtpServiceShortCode) {
        return this.smtpConfigurationProperties.getSmtpConfigs().get(smtpServiceShortCode);
    }
}
