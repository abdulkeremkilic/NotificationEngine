package sopheria.notificationengine.config.smtp.yml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Map;

@Configuration
@Profile("smtp-configs")
public class SmtpConfigurationProperties {

    private Map<String, SmtpConfig> smtpConfigs;

    public Map<String, SmtpConfig> getSmtpConfigs() {
        return smtpConfigs;
    }

    public void setSmtpConfigs(Map<String, SmtpConfig> smtpConfigs) {
        this.smtpConfigs = smtpConfigs;
    }
}
