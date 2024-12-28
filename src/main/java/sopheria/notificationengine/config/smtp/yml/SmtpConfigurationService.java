package sopheria.notificationengine.config.smtp.yml;

public interface SmtpConfigurationService {
    SmtpConfig inquireSmtpConfiguration(String smtpServiceShortCode);
}
